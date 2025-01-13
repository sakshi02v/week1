import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the entered number is a valid natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
        
        scanner.close(); // Close the scanner
    }
}