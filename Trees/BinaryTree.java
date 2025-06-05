import java.util.*;
import javax.swing.RootPaneContainer;
public class BinaryTree {
    static class node{
        int data;
        node right;
        node left;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static  class binarytree{
        static int idx=-1;
        public static node buildtree(int[] nodes)
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }

          node rg=new node(nodes[idx]);
          rg.left=buildtree(nodes);
          rg.right=buildtree(nodes);
          return rg;

        }
        public static void preorder(node root){
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
           preorder(root.left);
           preorder(root.right);

        }
        public static void inorder(node root)
        {
            if(root==null)
            {
                return;
            }
            preorder(root.left);
            System.out.print(root.data+" ");
            preorder(root.right);
        }
        public static void postorder(node root)
        {
            if(root==null)
            {
                return;
            }
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(node root)
        {
           // node rg=new node(root.data);
           Queue<node> list=new LinkedList<>();
           list.add(root);
           list.add(null);
           if(root==null)
           {
            return;
           }
            while(!list.isEmpty())
            {
                node curr=list.remove();
                if(curr==null)
                {
                    System.out.println();
                    if(list.isEmpty())
                    {
                        break;
                    }
                    else{
                        list.add(null);
                    }
                }
                else{
                //    if(root.left!=null)
                //    {
                    System.out.print(curr.data+" ");
                    if(curr.left!=null)
                    {
                        list.add(curr.left);

                    }
                    if(curr.right!=null)
                    {
                        list.add(curr.right);
                    }
                    
                // }
            }

        }
    }
    public static int countofnodes(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=countofnodes(root.left);
        int right=countofnodes(root.right);
        return left+right+1;
    }
    public static int sumofnodes(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftsum=sumofnodes(root.left);
        int rightsum=sumofnodes(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int height(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int myheight=Math.max(left,right)+1;
        return myheight;
    }
}
    public static void main(String[] args) {
        int[] node={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree rg=new binarytree();
        node a=rg.buildtree(node);
        System.out.println(a.data);
        System.out.println("Print Binary Tree in Pre-order");
        rg.preorder(a);
        System.out.println();
        System.out.println("Print Binary Tree in IN-order");
        rg.inorder(a);
        System.out.println();
        System.out.println("Print Binary Tree in Post-order");
        rg.postorder(a);
        System.out.println();
        System.out.println("Print Binary tree in level order");
        rg.levelorder(a);
        System.out.println();
        System.out.println("Count of the Nodes in Binary Tree");
        int b= rg.countofnodes(a);
        System.out.println(b);
        System.out.println("The Sum of the nodes in binarytree");
        int c=rg.sumofnodes(a);
        System.out.println(c);
        System.out.println("The Height of the Binary Tree is");
        int k=rg.height(a);
        System.out.println(k);


    }
}
