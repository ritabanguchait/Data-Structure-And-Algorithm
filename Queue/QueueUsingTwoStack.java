import java.util.Stack;

public class QueueUsingTwoStack {
    static Stack<Integer> list1 = new Stack<>();
    static Stack<Integer> list2 = new Stack<>();

    // Add an element to the queue
    public static void add(int data) {
        // Move all elements from list1 to list2
        while (!list1.isEmpty()) {
            list2.push(list1.pop());
        }

        // Push the new element into list1
        list1.push(data);

        // Move everything back from list2 to list1
        while (!list2.isEmpty()) {
            list1.push(list2.pop());
        }
    }

    // Remove the front element of the queue
    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int a = list1.peek();
        list1.pop();
        return a;
    }

    // Peek the front element
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return list1.peek();
    }

    // Check if queue is empty
    public static boolean isEmpty() {
        return list1.isEmpty();
    }

    public static void main(String[] args) {

        // Adding elements to the queue
        add(5);
        add(4);
        add(3);
        add(2);
        add(1);

        // Printing and removing all elements
        System.out.println("Queue elements (Front to Rear):");
        while (!isEmpty()) {
            System.out.print(peek() + " ");
            remove();
        }

        System.out.println(); // new line

        // Trying to remove from an empty queue
        System.out.println("Attempt to remove from an empty queue:");
        int a = remove(); // Should print "Queue is Empty"
        System.out.println("Removed value: " + a);

        // Final empty state check
        System.out.println("Final check (queue should be empty):");
        while (!isEmpty()) {
            System.out.print(peek() + " ");
            remove();
        }
    }
}
