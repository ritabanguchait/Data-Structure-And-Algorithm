class HappyNumber{

    // Function to calculate sum of squares of digits of n
    static int numSquareSum(int n)
    {
        int squareSum = 0;
        while (n!= 0)
        {
            squareSum += (n % 10) * (n % 10); // add square of last digit
            n /= 10; // remove last digit
        }
        return squareSum;
    }
     
    // Function to check if a number is happy or not
    static boolean isHappynumber(int n)
    {
        int slow, fast;
     
        // Initialize slow and fast pointers for cycle detection
        slow = fast = n;
        do
        {
            slow = numSquareSum(slow); // move slow pointer by one step
            fast = numSquareSum(numSquareSum(fast)); // move fast pointer by two steps
        }
        while (slow != fast); // loop until they meet (cycle detected)
     
        // If cycle is at 1, number is happy
        return (slow == 1);
    }
     
    // Main method
    public static void main(String[] args)
    {
        int n = 13;
        if (isHappynumber(n))
            System.out.println(n + " is a Happy number");
        else
            System.out.println(n + " is not a Happy number");
    }
}
