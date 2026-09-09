import java.util.*;

class Solution {
    public List<Integer> search(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                result.add(i);
            }
        }

        return result;
    }
}
