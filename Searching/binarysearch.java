import java.util.LinkedList;
import java.util.Queue;

public class binarysearch {
    static class node{
        int data;
        node right;
        node left;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
  
        public static node insert(node root,int val)
        {
            if(root==null)
            {
              root=new node(val);
              return root;
            }
            if(root.data>val)
            {
                root.left=insert(root.left,val);
            }
            else
            {
                root.right=insert(root.right, val);
            }
            return root;
        }
        public static void inorder(node root)
        {
            if(root==null)
            {
                return;
            }
           inorder(root.left);
           System.out.print(root.data+" ");
           inorder(root.right);
        }
        public static boolean search(node root,int data)
        {
            if(root==null)
            {
                return false;
            }
            if(root.data>data)
            {
                search(root.left, data);
            }
            else{
                search(root.right,data);
            }
            if(root.data==data)
            {
                return true;
            }
            else{
                return false;
            }
        }
        public static node delete(node root,int data)
        {
            if(root.data>data)
            {
               return root.left=delete(root.left,data);
            }
            if(root.data<data)
            {
                return root.right=delete(root.right,data);
            }
            else{
                if(root.right==null && root.left==null)
                {
                    return null;
                }
                if(root.right==null)
                {
                    return root.left;
                }
                if(root.left==null)
                {
                    return root.right;
                }
                node is=inordersucesser(root.right);
                root.data=is.data;
                root.right=delete(root.right, is.data);
            }
            return root;
        }
        public static node inordersucesser(node root)
        {
            while(root.left!=null)
            {
                root=root.left;
            }
            return root;
        }
        public static void printinrange(node root,int x,int y)
        {
            if(root==null)
            {
                return;
            }
            if(x<=root.data && root.data<=y)
            {
                printinrange(root.left, x, y);
                System.out.print(root.data+ " ");
                printinrange(root.right, x, y);
            }
            if(root.data<x)
            {
                printinrange(root.right, x, y);
            }
            if(root.data>y)
            {
                printinrange(root.left,x,y);
            }
            
        }
      
    
    public static void main(String[] args) {
        int value[]={5,1,3,4,2,7};
        node root=null;
        for(int i=0;i<value.length;i++)
        {
            root=insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 5))
        {
            System.out.println("Its Found");
        }
        else{
            System.out.println("Its not Found");
        }
        if(search(root, 14))
        {
            System.out.println("Its Fouund");
        }
        else{
            System.out.println("Its not found");
        }
        delete(root, 5);
        inorder(root);
        System.out.println();
        printinrange(root, 3, 10);

        // levelorder(root);
    }
    
}
