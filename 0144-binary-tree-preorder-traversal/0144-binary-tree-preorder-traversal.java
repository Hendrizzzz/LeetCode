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
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrderTraversalRecursion(root);
        return list;
    }
    
    private void preOrderTraversalRecursion(TreeNode root){
        if (root == null){
            return;
        }
        
        list.add(root.val);
        preOrderTraversalRecursion(root.left);
        preOrderTraversalRecursion(root.right);
    }
}