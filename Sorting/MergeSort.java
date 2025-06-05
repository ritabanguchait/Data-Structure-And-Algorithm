public class MergeSort
{
    public static void divide(int arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);

    }
    public static void conquer(int arr[],int si, int mid,int ei)
    {
        int[] merged=new int[ei-si+1];
        int idx=si;
        int idx1=mid+1;
        int x=0;
        while(idx<=mid && idx1<=ei)
        {
            if(arr[idx]<arr[idx1])
            {
                merged[x++]=arr[idx++];
            }
            else
            {
                merged[x++]=arr[idx1++];
            }
        }
        while(idx<=mid)
        {
            merged[x++]=arr[idx++];
        }
        while(idx1<=ei)
        {
            merged[x++]=arr[idx1++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++) 
        {
            arr[j]=merged[i];
        }
    }
    public static void printarray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int[] arr={9,2,8,5,7,3,15,12,20,16};
        System.out.println("The Unsorted array is");
        printarray(arr);
        int ei=arr.length-1;
        divide(arr, 0,ei);
        System.out.println("The Sorted Array is");
        printarray(arr);


    }
}
