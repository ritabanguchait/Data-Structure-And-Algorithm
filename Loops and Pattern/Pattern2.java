public class Pattern2 {
    public static void main(String[] args) {
        // Outer loop for rows from 1 to 5
        for(int k=1;k<=5;k++)
        {
            // Print spaces before the numbers in each row
            for(int j=k;j<5;j++)
            {
                System.out.print(" ");
            }
            // Print the current row number 'k', 'k' times with a space
            for(int i=1;i<=k;i++)
            {
                System.out.print(k);
                System.out.print(" ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
