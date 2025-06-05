import java.util.*;
public class StackColl {
    public static void main(String[] args) {
        Stack <Integer> list =new Stack<>();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.push(6);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        

    }
}
