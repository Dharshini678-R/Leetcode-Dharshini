// Last updated: 8/11/2026, 4:08:27 PM
// 700. Search in a Binary Search Tree
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) return root;
            root = val < root.val ? root.left : root.right;
        }
        return null;
    }
}