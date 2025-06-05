import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // Add the Element in Arraylist
    list.add(2);
    list.add(10);
    list.add(15);
    list.add(2, 4);
    list.add(6);
    System.out.println("Print the Arraylist");
    System.out.println(list);

    // Use get function to get the Element from Arraylist
    System.out.println("get the Element from Arraylist");
    int a = list.get(3);
    System.out.println(a);

    // Remove the Element from the Arraylist
    System.out.println("Remove the Element from the Arraylist");
    list.remove(3);
    System.out.println(list);
    list.add(20);

    // Modify The Element in Arraylist
    System.out.println("Modify The Element in Arraylist");
    list.set(3, 9);
    System.out.println(list);

    // use iterative function to print the all element of arraylist
    System.out.println("Print the Arraylist by iterative way");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+", ");
    }
    System.out.println();

    // sort the Arraylist
    System.out.println("TheSorted ArryList is");
    Collections.sort(list);
    System.out.println(list);

  }
}
