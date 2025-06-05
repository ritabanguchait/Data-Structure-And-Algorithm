public class FrequencyString {


    public static void main(String[] args) {
        // Declare a string
        String str = "This website is awesome.";

        // Character to check the frequency of
        char ch = 'e';

        // Variable to store the frequency count
        int frequency = 0;

        // Loop through each character of the string
        for(int i = 0; i < str.length(); i++) {
            // If current character matches the target character
            if(ch == str.charAt(i)) {
                ++frequency; // Increment frequency counter
            }
        }

        // Print the result
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}


