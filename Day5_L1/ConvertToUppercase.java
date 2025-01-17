import java.util.Scanner;

public class ConvertToUppercase {

    // Method to convert each character to uppercase using ASCII values
    public static String UpperCaseUsingCharAt(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // If the character is lowercase, convert it to uppercase using ASCII values
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32); // Convert to uppercase by subtracting 32 from the ASCII value
            }
            result.append(c);
        }
        return result.toString();
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter some text: ");
        String input = sc.nextLine();

        // Convert input using String built-in method toUpperCase()
        String upperCaseBuiltIn = input.toUpperCase();

        // Convert input using custom charAt() method
        String upperCaseCharAt = UpperCaseUsingCharAt(input);

        // Compare both results
        boolean areEqual = compareStrings(upperCaseBuiltIn, upperCaseCharAt);

        // Display the results
        System.out.println("Original text: " + input);
        System.out.println("Converted to uppercase using toUpperCase(): " + upperCaseBuiltIn);
        System.out.println("Converted to uppercase using charAt(): " + upperCaseCharAt);
        System.out.println("Are both results equal? " + (areEqual ? "Yes" : "No"));

        sc.close();
    }
}
