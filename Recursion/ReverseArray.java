import java.util.*;
public class ReverseArray {
    public static void reverse(int[] arr,int first,int last)
    {
        if(first>=last)
        {
           return;
        }
       int temp=arr[first];
       arr[first]=arr[last];
       arr[last]=temp;
       reverse(arr, first+1, last-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        reverse(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+"  ");
        }

        
    }
}
