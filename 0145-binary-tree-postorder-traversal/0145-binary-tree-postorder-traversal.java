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
    private List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorderTraversalRecursion(root);
        return list;
    }

    private void postorderTraversalRecursion(TreeNode root){
        if (root == null){
            return;
        }

        postorderTraversalRecursion(root.left);
        postorderTraversalRecursion(root.right);
        list.add(root.val);
    }
}