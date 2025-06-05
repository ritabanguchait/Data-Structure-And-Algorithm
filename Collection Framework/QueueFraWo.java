import java.util.*;
public class QueueFraWo {
    public static void main(String[] args) {
        Queue <Integer>list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);
        list.remove();
        list.remove();
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println("The size of List is "+list.size());
        
    }
    
}
