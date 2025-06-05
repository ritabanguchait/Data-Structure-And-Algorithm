import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

          //Add the Element in Arraylist
          list.add(2);
          list.add(10);
          list.add(15);
          list.add(2,4);
          list.add(6);
          System.out.println(list);

          //Use get function to get the value from Arraylist
          int a= list.get(3);
          System.out.println(a); 

          //Remove the Element from the Arraylist
          list.remove(3);
          System.out.println(list);
          list.add(20);

          //Modify The Element in Arraylist
          list.set(3,9);
          System.out.println(list);

          //use iterative function to print the all element of arraylist
          for(int i=0;i<list.size();i++)
          {
            System.out.println(list.get(i));
          }

          //sort the Arraylist
          Collections.sort(list);
          System.out.println(list);


    }
}
