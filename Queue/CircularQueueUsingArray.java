public class CircularQueueUsingArray {
    static class Queue {
        static int size;
        static int arr[];
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (rear == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            System.out.println("Added: " + data);
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int top = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue rg = new Queue(5);

        // Adding elements
        rg.add(5);
        rg.add(4);
        rg.add(3);
        rg.add(2);
        rg.add(1); // Queue is full now

        // Check if full
        if (Queue.isFull()) {
            System.out.println("Yes, the queue is full now.");
        } else {
            System.out.println("Queue is not full yet.");
        }

        // Removing and printing first element
        System.out.println("Removed element: " + rg.remove());

        // Check if still full
        if (Queue.isFull()) {
            System.out.println("Queue is still full.");
        } else {
            System.out.println("Queue has space now.");
        }

        // Adding one more Element
        System.out.println("Adding one more Element 25");
        rg.add(5);

        // Print remaining elements
        System.out.println("Remaining elements:");
        while (!Queue.isEmpty()) {
            System.out.print(Queue.peek() + " ");
            Queue.remove();
        }
    }
}
