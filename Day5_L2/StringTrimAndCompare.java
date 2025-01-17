import java.util.Scanner;

public class StringTrimAndCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = scanner.nextLine();

        // Trimming using custom method
        int[] startEnd = trimSpaces(input);
        String trimmedString = createSubstring(input, startEnd[0], startEnd[1]);

        // Trimming using built-in method
        String builtInTrimmed = input.trim();

        // Comparing the two results
        boolean isEqual = compareStrings(trimmedString, builtInTrimmed);

        // Displaying results
        System.out.println("Custom Trimmed String: \"" + trimmedString + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are the two trimmed strings equal? " + isEqual);
    }

    // Method to trim leading and trailing spaces
    public static int[] trimSpaces(String str) {
        int start = 0, end = str.length() - 1;

        // Trim leading spaces
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end + 1 because end
