public class Selection {
    public static void selection(int arr[])
    {
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
        int temp=arr[i];
        arr[i]=arr[smallest];
        arr[smallest]=temp;

    }
    }
    public static void main(String[] args) {
        int arr[]={4,2,10,5,8,3,7};
        selection(arr);
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
