import java.util.Scanner;

public class Fibonacciseries {

    // Function to print the fibonacci series
    static int fib(int n) {

        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms you want to print: ");
        int a = sc.nextInt();

        // Print the first N numbers
        for (int i = 0; i < a; i++) {

            System.out.print(fib(i) + " ");
        }
    }
}
