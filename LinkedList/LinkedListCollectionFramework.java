import java.util.*;

public class LinkedListCollectionFramework {
  public static void main(String[] args) {
    // Creating a LinkedList of Strings
    LinkedList<String> list = new LinkedList<String>();

    // Adding elements to the LinkedList
    list.add("Ritaban");
    list.add("Guchait");
    list.addFirst("is"); // Add at the beginning
    list.addFirst("Name"); // Add at the beginning
    list.addFirst("My"); // Add at the beginning

    // Print the LinkedList
    System.out.println("LinkedList after adding elements: " + list);

    // Print size of the list
    System.out.println("Size of the LinkedList: " + list.size());

    // Remove the last and first elements
    list.removeLast(); // Removes "Guchait"
    list.removeFirst(); // Removes "My"

    System.out.println("LinkedList after removing first and last: " + list);

    // Print the list Iteratively using for loop
    System.out.print("Elements printed one by one: ");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }

    // Uncomment to sort the list if needed
    // Collections.sort(list);
    // System.out.println("Sorted LinkedList: " + list);
  }
}
