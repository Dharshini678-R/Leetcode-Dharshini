// Last updated: 8/11/2026, 4:07:22 PM
// 977. Squares of a Sorted Array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                ans[i] = nums[l] * nums[l++];
            } else {
                ans[i] = nums[r] * nums[r--];
            }
        }
        return ans;
    }
}