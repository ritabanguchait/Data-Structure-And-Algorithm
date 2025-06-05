import java.util.*;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<Integer> list = new LinkedList<>();

        // Adding elements to the queue
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println("Initial Queue: " + list);

        // Removing first two elements (FIFO)
        list.remove(); // Removes 10
        list.remove(); // Removes 20

        System.out.println("Queue after removing two elements: " + list);

        // Peek returns the head of the queue
        System.out.println("Element at front (peek): " + list.peek());

        // Size of the queue
        System.out.println("The size of the Queue is: " + list.size());
    }
}
