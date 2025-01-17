import java.util.Scanner;

public class FirstNonRepeatingCh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String str) {
        int[] charFrequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop through the string to calculate character frequencies
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charFrequency[currentChar]++;
        }

        // Loop through the string to find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charFrequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}
