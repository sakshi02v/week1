import java.util.Scanner;

public class SplitTextComparison {

    // Method to find the length of the string without using length() method
    public static int calculateStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length); // Try to access each character
                length++; // Increment length for each valid character
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length; // Return length when exception occurs (end of string)
        }
    }

    // Method to split the text into words without using the split() method
    public static String[] customSplit(String str) {
        // Count words
        int wordCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // For the last word that is not followed by a space

        // Create an array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;

        // Split the text manually using space as a delimiter
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                // Extract the word (handling last word)
                int endIndex = (i == str.length() - 1 && str.charAt(i) != ' ') ? i + 1 : i;
                words[wordIndex] = str.substring(startIndex, endIndex).trim();
                wordIndex++;
                startIndex = i + 1;
            }
        }

        return words;
    }

    // Method to compare two string arrays for equality
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // If lengths are not equal, arrays are not equal
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false; // If any word is not equal, return false
            }
        }
        return true; // Arrays are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.println("Enter a text: ");
        String inputText = scanner.nextLine();

        // Call custom method to split the text
        String[] customSplitResult = customSplit(inputText);

        // Call built-in split() method
        String[] splitResult = inputText.split("\\s+");

        // Compare the results
        boolean areEqual = compareArrays(customSplitResult, splitResult);

        // Display the results
        System.out.println("Text split using custom split method:");
        for (String word : customSplitResult) {
            System.out.println(word);
        }

        System.out.println("\nText split using built-in split() method:");
        for (String word : splitResult) {
            System.out.println(word);
        }

        // Display if both methods give the same result
        System.out.println("\nDo both methods return the same result? " + areEqual);

        scanner.close();
    }
}
