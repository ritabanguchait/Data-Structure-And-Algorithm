import java.util.*;
public class PalindromNumber {
    static int rev(int n, int temp)
    {
        // base case
        if (n == 0)
            return temp;
     
        // stores the reverse
        // of a number
        temp = (temp * 10) + (n % 10);
     
        return rev(n / 10, temp);
    }
    public static void main(String[] args) {
        System.out.println("Enyter a Number to check its Palindrom or Not?");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= rev(a,0);
        if(a==b){
            System.out.println("Its a Palindrom Number");
        }
        else{
            System.out.println("Its not a palindrom Number");
        }

        
    }
}
