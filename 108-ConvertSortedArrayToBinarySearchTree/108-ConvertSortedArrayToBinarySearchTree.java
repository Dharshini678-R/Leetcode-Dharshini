// Last updated: 8/11/2026, 4:16:07 PM

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int l, int r) {
        if (l > r) return null;
        int m = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = build(nums, l, m - 1);
        root.right = build(nums, m + 1, r);
        return root;
    }
}