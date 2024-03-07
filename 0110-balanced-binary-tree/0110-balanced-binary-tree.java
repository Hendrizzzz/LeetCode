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
    public boolean isBalanced(TreeNode root) {
        return isBalancedRecursion(root);
    }
    
    private boolean isBalancedRecursion(TreeNode root){
        if (root == null){
            return true; 
        }
        int left = height(root.left);
        int right = height(root.right);
        
        return Math.abs(left - right) < 2 && isBalanced(root.left) & isBalanced(root.right);
    }
    
    private int height(TreeNode root){
        if (root == null){
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
        
    }
    
    
}