public class BubbleSort {

    // Method to print elements of the array
    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(); // For better formatting
    }

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = { 9, 2, 8, 5, 7, 3, 15, 12, 20, 16 };

        // Print original array
        printarray(arr);

        System.out.println("The Sorted Array is");

        // Bubble Sort algorithm
        // Outer loop for number of passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for pairwise comparisons
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Swap if elements are out of order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        printarray(arr);
    }
}
