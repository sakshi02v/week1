import java.util.Scanner;

public class PalindromeChecker {

    // Function to get input from the user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match
            }
            left++;
            right--;
        }
        return true; // The string is a palindrome
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    // Main function to run the program
    public static void main(String[] args) {
        String input = getInput(); // Get user input
        boolean result = isPalindrome(input); // Check if it is a palindrome
        displayResult(input, result); // Display the result
    }
}
