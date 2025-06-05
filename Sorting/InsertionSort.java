public class InsertionSort {

  // Method to print elements of the array
  public static void printarray(int[] arr) {
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    // Initialize the array
    int[] arr = { 9, 2, 8, 5, 7, 3, 15, 12, 20, 16 };

    // Print the unsorted array
    System.out.print("The Unsorted array is");
    printarray(arr);

    // Insertion Sort Algorithm
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i]; // Current element to be inserted in the sorted part
      int j = i - 1;

      // Shift elements of sorted part that are greater than key to the right
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }

      // Insert key at the correct position
      arr[j + 1] = key;
    }
    System.out.println();

    // Print the sorted array
    System.out.print("The Sorted Array is");
    printarray(arr);
  }
}
