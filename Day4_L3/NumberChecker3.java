import java.util.Arrays;

public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';  // Convert char to integer
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];  // Reverse the order
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a Duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;  // Duck number has at least one non-zero digit
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example number
        int number = 121;

        // Get digits array
        int[] digits = storeDigits(number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Reverse the digits
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));

        // Check if the number is a palindrome
        boolean palindrome = isPalindrome(digits);
        System.out.println("Is Palindrome: " + palindrome);

        // Check if the number is a Duck number
        boolean duck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + duck);

        // Compare original digits and reversed digits
        boolean areEqual = areArraysEqual(digits, reversedDigits);
        System.out.println("Are original digits and reversed digits equal? " + areEqual);
    }
}
