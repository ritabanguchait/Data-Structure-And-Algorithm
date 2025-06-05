public class captilize {

    // Function to capitalize first and last character of each word
    static String FirstAndLast(String str)
    {
        // Convert string to character array for manipulation
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int k = i; // store the start index of the word

            // Move i to the end of the current word (until a space or end of array)
            while (i < ch.length && ch[i] != ' ') {
                i++;
            }

            // Capitalize the first character of the word if it's a lowercase letter
            if (ch[k] >= 'a' && ch[k] <= 'z') {
                ch[k] = (char)(ch[k] - 32); // Convert to uppercase
            }

            // Capitalize the last character of the word if it's a lowercase letter
            if (ch[i - 1] >= 'a' && ch[i - 1] <= 'z') {
                ch[i - 1] = (char)(ch[i - 1] - 32); // Convert to uppercase
            }
        }

        // Convert character array back to string and return
        return new String(ch);
    }

    public static void main(String args[])
    {
        String str = "ritaban guchait";
        System.out.println(str); // Print original string
        System.out.println(FirstAndLast(str)); // Print capitalized result
    }
}
