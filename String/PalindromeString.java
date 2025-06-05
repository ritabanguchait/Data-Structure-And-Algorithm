import java.util.*;

public class PalindromeString {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str, int first, int last) {
        String lowerStr = str.toLowerCase();

        // Base case: if the first index meets or crosses the last
        if (first >= last) {
            return true;
        }

        // Check if characters match
        boolean isMatch = lowerStr.charAt(first) == lowerStr.charAt(last);

        // Recursive check for remaining substring
        return isMatch && isPalindrome(lowerStr, first + 1, last - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Palindrome String Checker =====");
        System.out.print("Enter a string to check: ");
        String input = sc.next();

        int first = 0;
        int last = input.length() - 1;

        if (isPalindrome(input, first, last)) {
            System.out.println(" It is a Palindrome String.");
        } else {
            System.out.println(" It is not a Palindrome String.");
        }

       
    }
}
