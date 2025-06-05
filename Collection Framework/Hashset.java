import java.util.*;
public class Hashset{
    public static void main(String[] args)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(25);
        System.out.println(set);
        set.remove(4);
        System.out.println(set);
        Scanner sc= new Scanner(System.in);
       
            System.out.println("Enter a element to check it contains or not");
            int a= sc.nextInt();
           if(set.contains(a))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
      Iterator<Integer> it=set.iterator();
      while(it.hasNext())
      {
        System.out.print(it.next()+" ");
      }
      System.out.println();
      ArrayList<Integer> list=new ArrayList<Integer>(set);
      Collections.sort(list);
      System.out.println(list);


    }
}