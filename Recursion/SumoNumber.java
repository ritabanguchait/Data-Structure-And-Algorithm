import java.util.*;

public class SumoNumber {

    // Recursive method to calculate sum from 1 to n
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Sum of Natural Numbers =====");
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("The sum of numbers from 1 to " + a + " is: " + sum(a));
        }
    }
}
