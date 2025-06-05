public class BubbleSort {
    public static void printarray (int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }

    }
    public static void main(String[] args) {
        int[] arr= {9,2,8,5,7,3,15,12,20,16};
        printarray(arr);
        System.out.println("The Sorted Array is");
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
             if(arr[j]>arr[j+1])
             {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
            }
        }
        printarray(arr);
        
    }
    
}
