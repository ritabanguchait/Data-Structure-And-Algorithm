import java.util.*;

public class ReverseArray {

    // Recursive function to reverse the array in place
    public static void reverse(int[] arr, int first, int last) {
        if (first >= last) {
            return; // Base case: when indices meet or cross
        }

        // Swap elements at 'first' and 'last'
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

        // Recursive call for inner sub-array
        reverse(arr, first + 1, last - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Array Reverser =====");
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse the array using recursion
        reverse(arr, 0, n - 1);

        // Display the reversed array
        System.out.println("Reversed array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
