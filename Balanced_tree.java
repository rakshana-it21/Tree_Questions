class Solution {
    int diff=0,max=0;
     public int check(Node root)
     {
       if(root==null) return 0;
       int lh=check(root.left);
       int rh=check(root.right);
       diff=Math.abs(rh-lh);
       if(diff>1) max=-1;
       return Math.max(lh,rh)+1;
     }
    
    public boolean isBalanced(Node root) {
        int t=check(root);
       if(max==-1) return false;
       return true;
    }
}