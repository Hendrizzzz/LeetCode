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
        return maxDepthRecursion(root);
    }
    
    private int maxDepthRecursion(TreeNode root){
        if (root == null){
            return 0;
        }
        
        int maxLeft = maxDepthRecursion(root.left) + 1;
        int maxRight = maxDepthRecursion(root.right) + 1;
        return Math.max(maxLeft, maxRight);
    }
}