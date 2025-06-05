import java.util.*;
public class Fibonacci {
    public static int fibomnacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibomnacci(n-2)+fibomnacci(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Calculate Fibonacci Value");
        int n=sc.nextInt();
        System.out.println(fibomnacci(n));
        
    }
}
