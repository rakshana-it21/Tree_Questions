class Solution {
   public int dia(TreeNode root,int[] diam){
        if(root==null) return 0;
        int lh=dia(root.left,diam);
        int rh=dia(root.right,diam);
        diam[0]=Math.max(lh+rh,diam[0]);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diam=new int[1];
        dia(root,diam);
        return diam[0];
    }
}