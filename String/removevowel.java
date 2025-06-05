import java.util.Scanner;

public class removevowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter The String");
        String s = sc.nextLine();

        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {

            // Check if the current character is a vowel (both lowercase and uppercase)
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                    || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {

                // Skip printing the vowel
                continue;
            } else {
                // Print the consonant or non-vowel character
                System.out.print(s.charAt(i));
            }
        }
    }
}
