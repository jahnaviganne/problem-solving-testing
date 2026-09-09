import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxUnique = 0;

        for (int i = 0; i < m; i++) {
            deque.addLast(arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        maxUnique = map.size();

        for (int i = m; i < n; i++) {
            int removed = deque.removeFirst();

            map.put(removed, map.get(removed) - 1);

            if (map.get(removed) == 0) {
                map.remove(removed);
            }

            deque.addLast(arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            maxUnique = Math.max(maxUnique, map.size());
        }

        System.out.println(maxUnique);

        sc.close();
    }
}
