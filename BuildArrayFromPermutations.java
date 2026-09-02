public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        BuildArrayFromPermutation obj = new BuildArrayFromPermutation();

        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = obj.buildArray(nums);

        for (int x : ans) {
            System.out.print(x + " ");
