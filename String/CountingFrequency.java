import java.util.*;
public class CountingFrequency {
    // Java program to print frequencies of all array
// elements in O(n) extra space and O(n) time

// Function to find counts of all elements 
// present in arr[0..n-1]. The array elements
// must be range from 1 to n
public static void findCounts(int arr[], int n)
{
    
    // Hashmap
    int hash[] = new int[n];
    Arrays.fill(hash, 0);
    
    // Traverse all array elements
    int i = 0;
    
    while (i < n)
    {
        
        // Update the frequency of array[i]
        hash[arr[i] - 1]++;
        
        // Increase the index
        i++;
    }
    System.out.println("\nBelow are counts " + 
                       "of all elements");
    for(i = 0; i < n; i++)
    {
        System.out.println((i + 1) + " -> " + 
                           hash[i]);
    }
}

// Driver code
public static void main(String []args)
{
    int arr[] = { 2, 3, 3, 2, 5 };
    findCounts(arr, arr.length);
    
    
}
}