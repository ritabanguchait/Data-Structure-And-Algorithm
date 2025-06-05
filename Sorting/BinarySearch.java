import java.util.*;
public class BinarySearch {
    // Binary Search in Recursively
   /*  public static int search(int first,int last,int target,int[] arr)
    {
        if(first<=last)
        {
            int mid=first+(last-first)/2;
         if(arr[mid]==target)
         {
                return mid;
         }
    
        if(arr[mid]<target)
        {
            return search(mid+1, last, target, arr);
        }
       return  search(first,mid-1,target,arr);
        

       }
       return -1;
    }*/
    // Binary search in Iteratively
    public static int search(int first,int last,int target,int[] arr)
    {
        while(first<=last)
        {
            int mid=first+(last-first)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                last=mid-1;
            }
            

                first=mid+1;
            
        }
        return -1;

    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Length of Array");
        int a=sc.nextInt();
        System.out.println("Enter the Element of the Array");
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENter the Element which you watnt to search");
        int b=sc.nextInt();
        if(search(0,a-1,b,arr)==-1)
        {
            System.out.println("Could not find the element");
        }
        else{
            System.out.println("Find the  Element in array at "+search(0,a-1,b,arr)+ "th position");
        }

    }
    
}
