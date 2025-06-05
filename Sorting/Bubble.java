public class Bubble{
    public static void bubblesort(int arr[])
    {
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length-1;j++)
        {
        if(arr[j]>arr[j+1])
        {
    
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }
        }
    }
}
    public static void main(String[] args)
    {
        int arr[]={4,2,10,5,8,3,7};
        bubblesort(arr);
    
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}