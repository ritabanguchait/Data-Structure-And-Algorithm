import java.util.*;
public class sumnumber {
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("The sum of "+a+" number is "+sum(a));
    }
}
