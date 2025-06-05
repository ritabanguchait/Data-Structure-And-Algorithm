import java.util.*;
public class LinkList {
    public static void main(String[] args) {
    LinkedList<String> list=new LinkedList<String>();
    list.add("Ritaban");
    list.add("Guchait");
    list.addFirst("is");
    list.addFirst("Name");
    list.addFirst("My");
    System.out.println(list);
    System.out.println(list.size());
    list.removeLast();
    list.removeFirst();

    // Print the list Iteravitavely
    for(int i=0;i<list.size();i++)
    {
        System.out.print(list.get(i)+" ");
    }
    //Collections.sort(list);
      //  System.out.println(list);
    }

    
}
