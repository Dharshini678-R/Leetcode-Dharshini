// Last updated: 8/11/2026, 4:16:11 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// 101. Symmetric Tree
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }

    private boolean mirror(TreeNode a, TreeNode b) {
        if (a == null || b == null) return a == b;
        return a.val == b.val
            && mirror(a.left, b.right)
            && mirror(a.right, b.left);
    }
}