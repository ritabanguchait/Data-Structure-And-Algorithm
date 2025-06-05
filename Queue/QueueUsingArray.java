public class QueueUsingArray {
    // Normal Queue Implementation Using Array
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;  // points to last element in queue
        static int front = -1; // points to first element in queue
        
        // Constructor to initialize queue size and array
        Queue(int n)
        {
            arr = new int[n];
            this.size = n;
        }

        // Check if queue is empty
        public static boolean isEmpty(){
            return rear == -1;    
        }

        // Check if queue is full
        public static boolean isFull(){
            return rear == size - 1;
        }

        // Add element to queue
        public static void add(int data)
        {
            if(rear == -1)
            {
                // First element being added
                front = 0;
                rear++;
                arr[rear] = data;
                return;
            }
            if(rear == size - 1)
            {
                System.out.println("You Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Peek at the front element without removing
        public static int peek()
        {
            if(rear == -1)
            {
                System.out.println("Your Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        // Remove element from the front of the queue
        public static int remove()
        {
            if(rear == -1)
            {
                System.out.println("Your Queue is Empty");
                return -1;
            }
            int top = arr[front];
            
            // Shift all elements to the left after removal
            for(int i = 0; i < rear; i++)
            {
                arr[i] = arr[i + 1];
            }
            rear--;
            return top;
        }

        // Print all elements in the queue
        public void print()
        {
            for(int i = 0; i <= rear; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue rg = new Queue(5);

        // Adding elements to the queue
        rg.add(5);
        rg.add(4);
        rg.add(3);
        rg.add(2);
        rg.add(1);

        // Check if the queue is full now
        if(Queue.isFull()){
            System.out.println("Queue is full now.");
        } else {
            System.out.println("Queue is not full yet.");
        }

        // Print the queue
        rg.print();

        // Remove an element and print the queue again
        int a = rg.remove();
        rg.print();
        System.out.println(a);

        // Remove all elements one by one, printing the front element before removal
        while(!rg.isEmpty())
        {
            System.out.print(rg.peek() + " ");
            rg.remove();
        }
    }
}
