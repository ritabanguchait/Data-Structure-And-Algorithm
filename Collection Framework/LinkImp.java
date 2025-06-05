public class LinkImp{
    static node head;
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfast(String data){
        node rg= new node(data);
        if(head==null)
        {
            head=rg;
            return;
        }
        rg.next=head;
        head=rg;

    }
    public void addlast(String data)
    {
        node rg= new node(data);
        if(head==null)
        {
            head=rg;
            return;
        }
        node curr=head;
        while(curr.next != null)
        {
           curr=curr.next;
        }
        curr.next=rg;
    }
    public void printlinklist()
    {
        if(head==null)
        {
            System.out.println("Your LinkLIst is Empty");
            return;
        }
        node curr=head;
        while(curr!= null)
        {
            System.out.print(curr.data+" ");
           curr=curr.next;
        }
       
    }
    public void deletelast()
    {
        if(head==null)
        {
            System.out.println("Your LInklist is Empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
        }
        node curr=head;
        node curr1=curr.next;
        while(curr1.next!= null)
        {
            curr=curr.next;
            curr1=curr1.next;
        }
        curr.next=null;
    }
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.println("Your linkList is Empty");
            return;
        }
        head=head.next;
    }
public static void reverselink()
{
    node prev=head;
    node curr=prev.next;
    while(curr.next!=null)
    {
    node next=curr.next;
    prev=prev.next;
    }
    head=curr;
}


    public static void main(String[] args){
        LinkImp rg=new LinkImp();
        rg.addfast("hi");
        rg.addlast("Ritaban");
        rg.addlast("Guchait");
        rg.printlinklist();
        rg.deletelast();
        System.out.println();
        rg.printlinklist();
        rg.deletefirst();
        System.out.println();
        rg.printlinklist();
        rg.reverselink();
        rg.printlinklist();


    }
}