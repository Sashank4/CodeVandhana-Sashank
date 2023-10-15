import java.util.HashSet;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        // Create a HashSet to store the unique alphabet characters
        HashSet<Character> alphabetSet = new HashSet<>();

        // Convert the input string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Iterate through the string and add alphabet characters to the HashSet
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        // Check if the HashSet contains all 26 letters of the alphabet
        return alphabetSet.size() == 26;
    }
}
