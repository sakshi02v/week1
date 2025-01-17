import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display results
        System.out.println("Unique characters in the string are:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }

    // Method to find the length of the string without using length()
    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = findLength(str);
        char[] unique = new char[length]; // Temporary array to store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is already in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If currentChar is unique, add it to the unique array
            if (isUnique) {
                unique[uniqueCount++] = currentChar;
            }
        }

        // Create a final array with exact size to store unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }
}
