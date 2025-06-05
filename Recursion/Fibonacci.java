import java.util.*;

public class Fibonacci {

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: fibonacci(0) = 0, fibonacci(1) = 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Fibonacci Calculator =====");
        System.out.print("Enter a number to calculate the Fibonacci value at that position: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Fibonacci is not defined for negative numbers.");
        } else {
            int result = fibonacci(n);
            System.out.println("The Fibonacci number at position " + n + " is: " + result);
        }

    }
}
