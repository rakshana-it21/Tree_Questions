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
     boolean split(TreeNode left_tree,TreeNode right_tree)
    {
        if(left_tree==null||right_tree==null) return left_tree==right_tree;
        
        return (left_tree.val==right_tree.val)&&
               (split(left_tree.left,right_tree.right))&&
               split(left_tree.right,right_tree.left);
    }
    public boolean isSymmetric(TreeNode root) {
       return split(root.left,root.right); 
    }
}