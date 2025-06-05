public class Pattern3 {
    public static void main(String[] args) {
        int a=5;  // Variable for printing '5's
        int b=4;  // Variable for printing '4's
        // Loop for each line (5 lines)
        for(int i=0;i<5;i++)
        {
          // Print (a - i - 1) times the value of 'a' (5)
          for(int j=i+1;j<a;j++)
          {
            System.out.print(a);
          }
          // Print (i + 1) times the value of 'b' (4)
          for(int k=0;k<=i;k++)
          {
            System.out.print(b);
          }
          // Move to next line after printing each row
          System.out.println();
        }
    }
}
