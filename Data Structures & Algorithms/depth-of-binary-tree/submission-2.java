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

        int height = 0;
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 1));

        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> cur = stack.pop();
            int depth = cur.getValue();
            TreeNode node = cur.getKey();

            height = Math.max(height, depth);
            if (node.right != null)
                stack.push(new Pair<>(node.right, depth + 1));
            if (node.left != null)
                stack.push(new Pair<>(node.left, depth + 1));
        }

        return height;
    }
}
