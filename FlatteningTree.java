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
    TreeNode flattenList(TreeNode root){
        if(root==null)
            return null;
        else{
          TreeNode left=flattenList(root.left);
            TreeNode right=flattenList(root.right);
            
            if(left!=null){
                TreeNode endLeft=left;
                while(endLeft.right!=null){
                    endLeft=endLeft.right;
                }
                endLeft.right=right;
             root.right=   left;
                root.left=null;
            }
            else{
                root.right=right;
                root.left=null;
            }
            return root;
            
            
        }
    }
    public void flatten(TreeNode root) {
        flattenList(root);
    }
}











