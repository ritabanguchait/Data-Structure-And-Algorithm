public class captilize {
    static String FirstAndLast(String str)
    {
 
        // Create an equivalent char array
        // of given string
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
 
            // k stores index of first character
            // and i is going to store index of last
            // character.
            int k = i;
          // Move 'i' until you find a space (end of the word)
             while (i < ch.length && ch[i] != ' ') {
                          i++;
                 }

             // Capitalize the first letter of the word
             if (ch[k] >= 'a' && ch[k] <= 'z') {
                 ch[k] = (char)(ch[k] - 32);
               }
            
            // Capitalize the last letter of the word
            if (ch[i - 1] >= 'a' && ch[i - 1] <= 'z') {
    ch[i - 1] = (char)(ch[i - 1] - 32);
}

     }
     return new String(ch);
}
 
    // Driver code
    public static void main(String args[])
    {
        String str = "ritaban guchait";
        System.out.println(str);
        System.out.println(FirstAndLast(str));
    }
    
}
