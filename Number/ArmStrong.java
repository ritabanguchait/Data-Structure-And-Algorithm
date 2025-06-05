import java.util.Scanner;
public class Armstrong {
  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a Number to check its Armstrong or Not");
        int a=sc.nextInt();
        int num=a;
        int sum=0;
        int digit=0;
        int rem=0;
        while(num>0)
        {
            num=num/10;
            ++digit;
        }
        num=a;
        while(num>0)
        {
           rem=num%10;
           sum=(int)(sum+Math.pow(rem,digit));
           num=num/10;
           
        }
        if(sum==a)
        {
            System.out.println("ITs a Armstrong Number");
        }
        else{
            System.out.println("ITs not a Armstrong Number12");
        }

    }
        
}
    
