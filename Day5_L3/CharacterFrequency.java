import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find character frequencies
        String[][] frequencyResult = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (String[] row : frequencyResult) {
            System.out.println("Character: " + row[0] + " Frequency: " + row[1]);
        }
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
        int[] charFrequency = new int[256]; // Array to store the frequency of ASCII characters
        int length = str.length();
        
        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            charFrequency[currentChar]++;
        }

        // Create a list of characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store the character and frequency pairs
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(charFrequency[i]);
                index++;
            }
        }

        return result;
    }
}
