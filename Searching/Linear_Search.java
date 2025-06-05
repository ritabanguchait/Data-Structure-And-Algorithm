import java.util.Scanner;

public class Linear_Search {
    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found target at index i
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int target = sc.nextInt();

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index: " + result);
        }

    }
}
