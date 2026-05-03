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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, root.val, 0);
    }

    private int dfs(TreeNode node, int maxVal, int count) {
        System.out.println(count);
        if (node == null) return count;

        if (node.val >= maxVal) {
            count++;
            maxVal = Math.max(node.val, maxVal);
        }
        count = dfs(node.left, maxVal, count);
        count = dfs(node.right, maxVal, count);
        return count;
    }
}
