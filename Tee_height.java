class Node
{
    int data;
    Node right;
    Node left;
    Node(int data)
    {
        this.data=data;
    }
}
class Tree
{
    void addLeft(int n,Node head)
    {
    Node curr=head;
    
    
        while(curr.left!=null)
        {
            curr=curr.left;
        }
        curr.left=new Node(n);
    
     
    }
    void addRight(int n,Node head)
    {
       Node curr=head;
      
         while(curr.right!=null)
        {
            curr=curr.right;
        }
        curr.right=new Node(n);  
       
    }
    int height(Node head)
    {
       if(head==null)
       {
           return -1;
       }
       return Math.max(height(head.left),height(head.right))+1;
       
    }
}

class Main
{
    public static void main (String[] args) {
        Node head=new Node(12);
        Tree t=new Tree();
        t.addLeft(8,head);
        t.addRight(18,head);
        t.addLeft(5,head);
        t.addRight(11,head);
        System.out.print("The height of the tree is"+" "+t.height(head));
    }
}