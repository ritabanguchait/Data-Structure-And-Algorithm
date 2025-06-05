import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>list=new HashMap<>();
        list.put("India", 1);
        list.put("China", 5);
        list.put("France", 2);
        list.put("US", 10);
        list.put("America", 15);
        list.put("Englad", 20);
        System.out.println(list);
       System.out.println(list.get("Japan"));

        if(list.containsKey("Japan"))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
     for(Map.Entry<String,Integer> e:list.entrySet())
     {
        System.out.print(e.getKey()+": ");
        System.out.print(e.getValue());
        System.out.println();
     }
     Set<String>keys=list.keySet();
     for(String key:keys)
     {
        System.out.println(key+" "+list.get(key));
     }
    }
    
}
