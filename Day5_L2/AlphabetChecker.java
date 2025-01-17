import java.util.Scanner;

public class AlphabetChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Finding characters and their types
        String[][] characterInfo = findCharacterTypes(input);

        // Displaying the results
        displayCharacterInfo(characterInfo);
    }

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char c) {
        // Convert to lowercase using ASCII values if it's an uppercase letter
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }

        // Check if it's a letter
        if (c >= 'a' && c <= 'z') {
            // Check if it's a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] findCharacterTypes(String str) {
        int length = str.length();
        String[][] characterInfo = new String[length][2];

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            characterInfo[i][0] = String.valueOf(c);
            characterInfo[i][1] = checkCharType(c);
        }

        return characterInfo;
    }

    // Method to display the 2D array of character types in tabular format
    public static void displayCharacterInfo(String[][] characterInfo) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-----------------------");

        for (String[] row : characterInfo) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }
}
