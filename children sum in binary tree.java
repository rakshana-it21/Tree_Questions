class Solution {
    // Function to check whether all nodes of a tree have the value
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
      Queue<Node>q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty())
      {
        
            Node t=q.poll();
            int temp=t.data;
            int sum=0;
         
             if(t.left==null&&t.right==null) continue;
             if(t.left!=null)
             {
                 sum+=t.left.data;
                
                 q.add(t.left);
             }
             if(t.right!=null)
             {
               
                 sum+=t.right.data;
                 q.add(t.right);
             }
             
             
         
        
         if((sum!=temp)) return 0; 
         
      }
      return 1;
    }
}