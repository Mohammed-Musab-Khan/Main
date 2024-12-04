/*
 * Title: Code to calculate the length of the way people and to print each letter using the index.
 * Auther: Mohammed Musab Khan
 */
public class App {
    public static void main(String[] args) throws Exception {
        // create a string variable for storing the word
        String word = "Hello, World!";

        // Conut the lenght/number of characters in the word
        int length = word.length();

        // Print the length of the word
        System.out.println("The length of the word is: " + length);

        // Loop through each character in the word and print each character
        for (int i = 0; i < length; i++) {
            // Print the character at the current index
            System.out.println(word.charAt(i));
        }
    }
}
