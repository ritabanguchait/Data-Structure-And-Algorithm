import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> list = new HashMap<>();
        list.put("India", 1);
        list.put("China", 5);
        list.put("France", 2);
        list.put("US", 10);
        list.put("America", 15);
        list.put("Englad", 20);

        // Print the entire HashMap
        System.out.println("Print the entire HashMap:");
        System.out.println(list);

        // Get and print the value for key "Japan" (which does not exist)
        System.out.println("Get the value for key 'Japan' from the HashMap:");
        System.out.println(list.get("Japan"));

        // Check if the key "Japan" exists and print result
        System.out.println("Check if key 'Japan' exists in the HashMap:");
        if (list.containsKey("Japan")) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }

        // Iterate through the HashMap entries using entrySet() and print key-value
        // pairs
        System.out.println("Iterate over HashMap entries using entrySet():");
        for (Map.Entry<String, Integer> e : list.entrySet()) {
            System.out.print(e.getKey() + ": ");
            System.out.print(e.getValue());
            System.out.println();
        }

        // Get all keys from the HashMap and iterate using keySet()
        Set<String> keys = list.keySet();
        System.out.println("Iterate over HashMap keys using keySet():");
        for (String key : keys) {
            System.out.println(key + " " + list.get(key));
        }
    }
}
