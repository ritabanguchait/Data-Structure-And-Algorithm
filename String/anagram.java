import java.util.Arrays;
import java.util.Scanner;

class anagram {

    // Function to check if two strings are anagrams
    static boolean areAnagram(String str1, String str2) {
        // Remove all spaces from both strings and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If the lengths are different, they can't be anagrams
        if (str1.length() != str2.length())
            return false;

        // Convert the strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays; if equal, strings are anagrams
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        // Prompt user to enter the first string
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        // Prompt user to enter the second string
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Call the areAnagram function and print the result
        if (areAnagram(s1, s2))
            System.out.println("The two strings are anagrams of each other.");
        else
            System.out.println("The two strings are not anagrams.");

        // Close the scanner resource
        sc.close();
    }
}
