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
    public TreeNode invertTree(TreeNode root) {
        invertTreeRecursion(root);
        return root;
    }
    
    private void invertTreeRecursion(TreeNode root){
        if (root == null){
            return;
        }
        boolean rightIsNull = root.right == null;
        boolean leftIsNull = root.left == null;
        if (leftIsNull && rightIsNull){
            return;
        }
        
        if (!rightIsNull && !leftIsNull){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        } else if (!rightIsNull){
            root.left = root.right;
            root.right = null;
        } else {
            root.right = root.left;
            root.left = null;
        }
        
        invertTreeRecursion(root.left);
        invertTreeRecursion(root.right);
        
    }
}