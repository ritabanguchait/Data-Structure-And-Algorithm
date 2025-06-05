import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

    // Binary search method
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Found target at index mid
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking the Length of the Array
        System.out.println("Enter the length of the Array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking the Element of the Array
        System.out.println("Enter the Elemnet of the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the Arry
        Arrays.sort(arr);

        // Print the Array After Soting
        System.out.println("The Sorting of the Array is");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println();

        System.out.println("Enter the number to search:");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index: " + result);
        }

    }
}
