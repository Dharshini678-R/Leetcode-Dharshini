// Last updated: 8/11/2026, 4:13:35 PM
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
// 257. Binary Tree Paths
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, "", ans);
        return ans;
    }

    private void dfs(TreeNode node, String path, List<String> ans) {
        if (node == null) return;

        path += node.val;
        if (node.left == null && node.right == null) {
            ans.add(path);
            return;
        }

        path += "->";
        dfs(node.left, path, ans);
        dfs(node.right, path, ans);
    }
}