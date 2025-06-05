public class MergeSort {

    // Method to recursively divide the array into two halves
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return; // Base case: when the array has one or no element
        }

        int mid = si + (ei - si) / 2; // Find the mid index

        // Recursively divide the left half
        divide(arr, si, mid);

        // Recursively divide the right half
        divide(arr, mid + 1, ei);

        // Merge the two sorted halves
        conquer(arr, si, mid, ei);
    }

    // Method to merge two sorted subarrays
    public static void conquer(int arr[], int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1]; // Temporary array to hold merged result

        int idx = si;      // Pointer for the left subarray
        int idx1 = mid + 1; // Pointer for the right subarray
        int x = 0;          // Pointer for the merged array

        // Compare and merge the elements from both subarrays
        while (idx <= mid && idx1 <= ei) {
            if (arr[idx] < arr[idx1]) {
                merged[x++] = arr[idx++];
            } else {
                merged[x++] = arr[idx1++];
            }
        }

        // Copy remaining elements from left subarray (if any)
        while (idx <= mid) {
            merged[x++] = arr[idx++];
        }

        // Copy remaining elements from right subarray (if any)
        while (idx1 <= ei) {
            merged[x++] = arr[idx1++];
        }

        // Copy merged array back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // Method to print the array
    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {9, 2, 8, 5, 7, 3, 15, 12, 20, 16};

        System.out.println("The Unsorted array is");
        printarray(arr);

        int ei = arr.length - 1;

        // Call the divide method to sort the array
        divide(arr, 0, ei);

        System.out.println("The Sorted Array is");
        printarray(arr);
    }
}
