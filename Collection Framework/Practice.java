import java.util.*;
public class Practice{
    static node head;
static class node{
    node next;
    int data;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public static void addfirst(int data)
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
public static void addlast(int data)
{
    node rg=new node(data);
    if(head==null)
    {
        head=rg;
        return;
    }
    node curr=head;
    while(curr.next!=null)
    {
        curr=curr.next;
    }
    curr.next=rg;
}
public static void printlin()
{
    if(head==null)
    {
        return;
    }
    node 
}
    public static void main(String[] args) {
        
    }
  }