class Pattern{
    public static void main(String[] args){
        // Outer loop for number of rows
        for(int k=0;k<5;k++)
        {
            // Print spaces, decreasing with each row
            for(int i=k;i<4;i++)
            {
                System.out.print(" ");
            }
            // Print 5 stars in each row
            for(int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            // Move to next line after printing stars in each row
            System.out.println();
        }
    }
}
