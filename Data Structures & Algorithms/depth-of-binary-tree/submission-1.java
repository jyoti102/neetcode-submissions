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
        int height = 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        stack.push(root);
        counts.push(1);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int count = counts.pop();

            if (node != null) {
                height = Math.max(count, height);

                stack.push(node.left);
                counts.push(count + 1);
                stack.push(node.right);
                counts.push(count + 1);
            }
        }

        return height;
    }
}
