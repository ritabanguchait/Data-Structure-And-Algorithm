public class SelectionSort {

    // Method to print the elements of the array
    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        System.out.println("The Unsorted Array is");

        // Initialize an unsorted array
        int[] arr = { 6, 9, 2, 14, 20, 11, 3, 7, 60, 35, 42, 61 };

        // Print the original array
        printarray(arr);
        System.out.println();

        // Selection Sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i; // Assume current index has the smallest value

            // Find the actual smallest element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j; // Update index of the smallest element
                }
            }

            // Swap the current element with the smallest element found
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("The Sorted Array is");

        // Print the sorted array
        printarray(arr);
    }
}
