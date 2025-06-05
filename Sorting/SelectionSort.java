public class SelectionSort {
    public static void printarray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    } 
    public static void main(String[] args) {
        System.out.println("The Unsorted Array is");
        int[] arr={6,9,2,14,20,11,3,7,60,35,42,61};
        printarray(arr);
        System.out.println();
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
                
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The Sorted Array is");
        printarray(arr);
    }
}
