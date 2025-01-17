import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find character frequencies
        String[] frequencyResult = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (String result : frequencyResult) {
            System.out.println(result);
        }
    }

    // Method to find the frequency of characters using nested loops
    public static String[] findCharacterFrequency(String str) {
        char[] charArray = str.toCharArray(); // Convert string to character array
        int length = charArray.length;
        String[] result = new String[length]; // Array to store the characters and frequencies
        int index = 0;

        // Outer loop to iterate through each character in the string
        for (int i = 0; i < length; i++) {
            // Skip if the character is already counted
            if (charArray[i] == '0') {
                continue;
            }

            // Initialize frequency of each character to 1
            int frequency = 1;

            // Inner loop to check for duplicates of the character
            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency++; // Increment frequency for duplicate characters
                    charArray[j] = '0'; // Mark as '0' to avoid counting it again
                }
            }

            // Store the character and its frequency in the result array
            result[index++] = charArray[i] + " - " + frequency;
        }

        // Resize the result array to remove unused slots
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }
}
