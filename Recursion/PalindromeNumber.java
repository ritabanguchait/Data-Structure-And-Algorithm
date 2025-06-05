import java.util.*;

public class PalindromeNumber {

    // Recursive method to reverse the number
    static int reverse(int n, int temp) {
        // Base case: when all digits are processed
        if (n == 0)
            return temp;

        // Add the last digit to the reversed number
        temp = (temp * 10) + (n % 10);

        // Recursive call with remaining digits
        return reverse(n / 10, temp);
    }

    public static void main(String[] args) {
        System.out.println("===== Palindrome Number Checker =====");
        System.out.print("Enter a number to check: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reversed = reverse(number, 0);

        if (number == reversed) {
            System.out.println("It is a Palindrome Number.");
        } else {
            System.out.println("It is not a Palindrome Number.");
        }
    }
}
