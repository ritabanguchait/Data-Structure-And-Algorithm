public class InsertionSort{
    public static void printarray(int[] arr)
    {
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr={9,2,8,5,7,3,15,12,20,16};
        System.out.print("The Unsorted array is");
        printarray(arr);
        for(int i=1;i<arr.length;i++)
        {
          int key=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>key)
          {
            arr[j+1]=arr[j];
            j--;
          }
          arr[j+1]=key;


        }
        System.out.print("The Sorted Array is");
        printarray(arr);
    }
}