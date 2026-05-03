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

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return max(root, 0);
    }

    int max(TreeNode root, int count) {
        if (null != root) {
            int left = max(root.left, count+1);
            int right = max(root.right, count+1);
            count = Math.max(left, right);
        }
        return count;
    }
}
