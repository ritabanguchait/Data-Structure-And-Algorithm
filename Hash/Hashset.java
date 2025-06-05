import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        // Create a HashSet to store Integer values
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the HashSet (duplicates like 5 will be ignored)
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(25);

        // Print the HashSet (order is not guaranteed)
        System.out.println("HashSet elements: " + set);

        // Remove element 4 from the HashSet
        set.remove(4);
        System.out.println("HashSet after removing 4: " + set);

        // Take user input to check if element exists in the HashSet
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to check if it is contained in the HashSet:");
        int a = sc.nextInt();

        // Check and print whether the element is present in the HashSet
        if (set.contains(a)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Iterate over the HashSet elements using an Iterator and print them
        System.out.print("Print th element in Iterative Way ");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Convert the HashSet to an ArrayList to sort the elements
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);

        // Print the sorted list of elements
        System.out.println("Sorted elements: " + list);
    }
}
