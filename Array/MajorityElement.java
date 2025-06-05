import java.util.Scanner;
class MajorityElement {
    
    // Function to find the majority element using Moore's Voting Algorithm
    static int majorityElement(int[] arr) {
        int n = arr.length;
        int candidate = -1;
        int count = 0;

        // Step 1: Find a candidate for majority element
        for (int num : arr) {
            if (count == 0) {
                candidate = num;  // Set new candidate
                count = 1;
            } else if (num == candidate) {
                count++;  // Increase count if same as candidate
            } else {
                count--;  // Decrease count if different
            }
        }

        // Step 2: Verify if candidate is actually the majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // Step 3: Return candidate if it appears more than n/2 times
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;  // No majority element found
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the Array");
        int n=sc.nextInt();
        int[] arr = new int[n];

        //Taking Element of the Arry
        System.out.println("Enter the element of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        // Print the result
        System.out.println("The Majority Element is " + majorityElement(arr));
    }
}
