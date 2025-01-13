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

    // Method to check if the number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;  // Duck number has at least one non-zero digit
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int number) {
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }
        return new int[] {largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] {smallest, secondSmallest};
    }

    public static void main(String[] args) {
        // Example number
        int number = 153;

        // Get digits array
        int[] digits = storeDigits(number);

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Check if it's a Duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if it's an Armstrong number
        boolean isArmstrong = isArmstrongNumber(digits, number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find largest and second largest digits
        int[] largestDigits = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestDigits[0]);
        System.out.println("Second largest digit: " + largestDigits[1]);

        // Find smallest and second smallest digits
        int[] smallestDigits = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestDigits[0]);
        System.out.println("Second smallest digit: " + smallestDigits[1]);
    }
}
