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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        result.addAll(getVal(root));
        return result;
    }

    List<Integer> getVal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        if (null != root) {
                valList.addAll(getVal(root.left));
                valList.add(root.val);
                valList.addAll(getVal(root.right));
        }
        return valList;
    }
}