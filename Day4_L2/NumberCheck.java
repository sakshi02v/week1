import java.util.Scanner;

public class NumberCheck {

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if a positive number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1, 0, or -1
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1; // num1 is greater
        } else if (num1 == num2) {
            return 0; // num1 and num2 are equal
        } else {
            return -1; // num1 is less
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the 5 numbers
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < 5; i++) {
            String sign = isPositive(numbers[i]);
            if (sign.equals("Positive")) {
                System.out.println("Number " + numbers[i] + " is positive and " + isEven(numbers[i]) + ".");
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } 
		else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } 
		else {
            System.out.println("The first number is less than the last number.");
        }
		
    }
}
