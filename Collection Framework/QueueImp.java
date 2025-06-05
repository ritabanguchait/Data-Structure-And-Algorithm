import java.util.*;
public class QueueImp {
//Nomal Queue Implementation Using Array
   /*static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        Queue(int n)
        {
           arr=new int[n];
           this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1;    
            }
        public static void add(int data)
        {
            if(rear==-1)
            {
                front=0;
                rear++;
                arr[rear]=data;
                return;
            }
          if(rear==size-1)
          {
            System.out.println("You Queue is full");
            return;
          }
          rear++;
          arr[rear]=data;

        }
        public static int peek()
        {
            if(rear==-1)
            {
                System.out.println("Your Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        public static int remove()
        {
            if(rear==-1)
            {
                System.out.println("Your Queue is Empty");
                return -1;
            }
            int top=arr[front];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return top;

        }
        public void print()
        {
            for(int i=0;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
   */
//Circular Queue Implementation Using Array

/*static class Queue{
    static int size;
    static int arr[];
    static int rear =-1;
    static int front=-1;
    Queue(int n)
    {
        arr=new int[n];
        this.size=n;
    }
    public static boolean isFull()
    {
        return (rear+1)%size==front;
    }
    public static boolean isEmpty()
    {
        return rear==-1 && front==-1;
    }
    public void add(int data)
    {
        if(isFull())
        {
           System.out.println("Queue is Full");
           return;
        }
        if(rear==-1)
        {
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    public static int remove()
    {
       if(isEmpty())
       {
        System.out.println("Queue is Empty");
        return -1;
       }
       int top=arr[front];
       if(rear==front)
       {
        rear=front=-1;
       }
       else{
       front=(front+1)%size;
       }
       return top;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return  -1;
        }
        return arr[front];

    }
}
*/

//Queue Implementation Using LinkedList

static class node{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
static class Queue{
    static node tail=null;
    static node head=null;
    public static boolean isEmpty()
    {
        return head==null && tail==null;
    }
    public static void add(int data)
    {
        node rg=new node(data);
        if(isEmpty())
        {
          
          head=tail=rg;
            return;
        }
        tail.next=rg;
        tail=rg;
        
    }
    public static int remove()
    {
        if(isEmpty())
        {
          System.out.println("Queue is Empty");
          return -1;
        }
        if(head==tail)
        {
            tail=null;
        }
        int top=head.data;
        head=head.next;
        return top;

    }
    public static int peek()
    {
        if(isEmpty())
        {
          System.out.println("Queue is Empty");
          return -1;
        }
        return head.data;
    }

}

//Queue Implementation using two Stack

/*static class Queue{
   static Stack<Integer> list1=new Stack<>();
   static  Stack<Integer> list2=new Stack<>();
    public static void add(int data)
    {
       while(!list1.isEmpty())
       {
        list2.push(list1.pop()); 
       }
       list1.push(data);
       while(!list2.isEmpty())
       {
        list1.push(list2.pop());
       }
       
    }
    public static int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int a=list1.peek();
        list1.pop();
        return a;
    }
    public static int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return list1.peek();
    }
    public static boolean isEmpty()
    {
        return list1.isEmpty();
    }
}*/


    
    public static void main(String[] args) {
      Queue rg = new Queue();
      rg.add(5);
      rg.add(4);
      rg.add(3);
      rg.add(2);
      rg.add(1);
      //rg.print();
      //int a= rg.remove();
      //  rg.print();
      //System.out.println(a);
      while(!rg.isEmpty())
      {
        System.out.print(rg.peek()+" ");
        rg.remove(); 
      }
      
      


    }
}
