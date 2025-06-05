public class LinkedListImplementation {
    static node head;

    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add new node at the beginning of the list
    public void addfast(String data) {
        node rg = new node(data);
        if (head == null) {
            head = rg;
            return;
        }
        rg.next = head;
        head = rg;

    }

    // Add new node at the end of the list
    public void addlast(String data) {
        node rg = new node(data);
        if (head == null) {
            head = rg;
            return;
        }
        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = rg;
    }

    // Print the linked list nodes
    public void printlinklist() {
        if (head == null) {
            System.out.println("Your LinkLIst is Empty");
            return;
        }
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    // Delete the last node from the list
    public void deletelast() {
        if (head == null) {
            System.out.println("Your LInklist is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
        }
        node curr = head;
        node curr1 = curr.next;
        while (curr1.next != null) {
            curr = curr.next;
            curr1 = curr1.next;
        }
        curr.next = null;
    }

    // Delete the first node from the list
    public void deletefirst() {
        if (head == null) {
            System.out.println("Your linkList is Empty");
            return;
        }
        head = head.next;
    }

    // Reverse the linked list (logic incomplete)
    public static void reverselink() {
        node prev = null;
        node curr = head;
        node next;

        while (curr != null) {
            next = curr.next; // Store next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev to current
            curr = next; // Move curr to next
        }

        head = prev; // Set new head of the reversed list
    }

    public static void main(String[] args) {
        LinkedListImplementation rg = new LinkedListImplementation();

        System.out.println("Add 'hi' at the beginning:");
        rg.addfast("hi");

        System.out.println("Add 'Ritaban' at the end:");
        rg.addlast("Ritaban");

        System.out.println("Add 'Guchait' at the end:");
        rg.addlast("Guchait");

        System.out.print("Print LinkedList: ");
        rg.printlinklist();

        System.out.println("\nDelete the last node:");
        rg.deletelast();

        System.out.print("Print LinkedList: ");
        rg.printlinklist();

        System.out.println("\nDelete the first node:");
        rg.deletefirst();

        System.out.print("Print LinkedList: ");
        rg.printlinklist();

        System.out.println("\nReverse the linked list:");
        rg.reverselink();

        System.out.print("Print LinkedList: ");
        rg.printlinklist();

    }
}
