import java.util.*;
public class Practice {
  public static boolean issorted(int[] n,int length)
  {
    int a=length-1;
    if(length==0 || length==1)
    {
     return true;
    }
    return n[a]>n[a-1] && issorted(n,length-1);
  }
   public static void main(String[] args) {
     System.out.println("enter a number in array");
     Scanner sc=new Scanner(System.in);
     int[] arr= new int[1];
     for(int i=0;i<arr.length;i++)
     {
        arr[i]=sc.nextInt();
     }
     if(issorted(arr, arr.length))
     {
        System.out.println("Array is Sorted");
     }
     else{
        System.out.println("Array is not Sorted");
     }            
    
     
   } 
}
