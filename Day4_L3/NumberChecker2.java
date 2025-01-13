import java.util.Arrays;

public class NumberChecker2 {

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

    // Method to find the sum of the digits of the number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits using Math.pow()
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // We know digits range from 0-9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Store the digit
            frequency[i][1] = 0; // Initialize frequency to 0
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        // Example number
        int number = 21;

        // Get digits array
        int[] digits = storeDigits(number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        // Sum of squares of digits
        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Check if it's a Harshad number
        boolean isHarshad = isHarshadNumber(digits, number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Frequency of each digit
        int[][] frequencies = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] freq : frequencies) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + " occurs " + freq[1] + " time(s).");
            }
        }
    }
}
