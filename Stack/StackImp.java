import java.util.*;
public class StackImp {
   // Stack Implementation Using LinkedList 
    /*static node head;
    static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static void push(int data)
    {
        node rg=new node(data);
        if(head==null)
        {
          head=rg;
          return;
        }
        rg.next=head;
        head=rg;
    }
    static int pop()
    {
      if(head==null)
      {
        return -1;
      }
      int top=head.data;
      head=head.next;
      return top;
    }
    static int peek()
    {
        if(head==null)
        {
            return -1;
        }
        return head.data;
    }
    static boolean isEmpty()
    {
        return head==null;
    }*/


    //Statck Implementation Using ArrayList
    static ArrayList<Integer> List=new ArrayList<>();
    static void  push(int data)
    {
        List.add(data);

    }
    static int pop()
    {
        int top=List.get(List.size()-1);
       List.remove(List.size()-1);
       return top;
    }
    static int peek()
    {
       return List.get(List.size()-1);
    }
    static boolean isEmpty()
    {
        return List.size()==0;
    } 
    public static void main(String[] args) {
       StackImp rg=new StackImp();
       rg.push(5);
       rg.push(4);
       rg.push(6);
       rg.push(3);
       rg.push(2);

       rg.pop();
       while(!rg.isEmpty())
       {
        System.out.println(rg.peek());
        rg.pop();
       }
      

       


    }

    
    
}
