import java.util.*;
public class Palindrom {
    public static boolean  palindrom(String a,int first,int last){
        String m=a.toLowerCase();
        if(first>=last)
        {
            return true;
        }
        boolean k= m.charAt(first)==m.charAt(last);
        return k && palindrom(m,first+1,last-1);

    }
    public static void main(String[] args) {
        System.out.println("Enter a String to check it palindrom or not");
        Scanner sc=new Scanner(System.in);
        String k=sc.next();
        int last=k.length()-1;
        int first=0;
        if( palindrom(k, first, last))
        {
            System.out.println("Its a Palindrom Number");
        }
        else
        {
            System.out.println("Its not a Palindrom Number");
        }

        
    }
}
