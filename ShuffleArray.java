public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }

        return ans;
    }

    public static void main(String[] args) {
        ShuffleArray obj = new ShuffleArray();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = obj.shuffle(nums, n);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
