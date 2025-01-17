import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text to check if it's a palindrome:");
        String input = scanner.nextLine();

        // Logic 1: Palindrome check using start and end comparison
        boolean isPalindrome1 = isPalindromeUsingStartEnd(input);
        System.out.println("Using start-end comparison: " + (isPalindrome1 ? "Palindrome" : "Not a Palindrome"));

        // Logic 2: Palindrome check using recursion
        boolean isPalindrome2 = isPalindromeRecursively(input, 0, input.length() - 1);
        System.out.println("Using recursion: " + (isPalindrome2 ? "Palindrome" : "Not a Palindrome"));

        // Logic 3: Palindrome check using character arrays
        boolean isPalindrome3 = isPalindromeUsingCharArray(input);
        System.out.println("Using character arrays: " + (isPalindrome3 ? "Palindrome" : "Not a Palindrome"));
    }

    // Logic 1: Palindrome check using start and end comparison
    public static boolean isPalindromeUsingStartEnd(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop through the text and compare characters from start and end
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // If characters do not match, return false
            }
            start++;
            end--;
        }
        return true; // If all characters match, return true
    }

    // Logic 2: Palindrome check using recursion
    public static boolean isPalindromeRecursively(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: if start index is greater than or equal to end index
        }

        // If characters at start and end are not equal, return false
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursively check the next pair of characters
        return isPalindromeRecursively(str, start + 1, end - 1);
    }

    // Logic 3: Palindrome check using character arrays
    public static boolean isPalindromeUsingCharArray(String str) {
        char[] originalArray = str.toCharArray(); // Convert string to character array
        char[] reverseArray = reverseString(str); // Get the reversed array

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; // If characters do not match, return false
            }
        }
        return true; // If all characters match, return true
    }

    // Method to reverse the string using charAt() method and return the reversed character array
    public static char[] reverseString(String str) {
        int length = str.length();
        char[] reversedArray = new char[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = str.charAt(length - 1 - i); // Reverse the string
        }

        return reversedArray;
    }
}
