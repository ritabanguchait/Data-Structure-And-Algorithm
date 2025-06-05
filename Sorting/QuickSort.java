public class QuickSort {

    // Method to perform quick sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);  // Left part
            quickSort(arr, pivotIndex + 1, high); // Right part
        }
    }

    // Method to partition the array and place the pivot at correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1;       // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element to its correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {9, 2, 8, 5, 7, 3, 15, 12, 20, 16};

        System.out.println("Unsorted Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1); 

        System.out.println("Sorted Array using Quick Sort:");
        printArray(arr);
    }
}
