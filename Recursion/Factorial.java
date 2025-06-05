import java.util.*;

public class Factorial {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call: n * factorial of (n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take user input

        System.out.println("===== Factorial Calculator =====");
        System.out.print("Enter a positive integer: ");
        int a = sc.nextInt(); // Read input number

        // Input validation
        if (a < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(a); // Call factorial method
            System.out.println("The factorial of " + a + " is: " + result);
        }

    }
}
