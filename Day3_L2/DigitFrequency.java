import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        int[] digits = new int[10]; // Array to store digits
        int[] frequency = new int[10]; // Array to store frequency of each digit

        while (number > 0) {
            int digit = number % 10;
            digits[digit]++;
            number /= 10;
        }

        // Display frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (digits[i] > 0) {
                System.out.println("Digit " + i + ": " + digits[i]);
            }
        }
    }
}