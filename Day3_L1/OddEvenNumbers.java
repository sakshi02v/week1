import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a positive natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a positive natural number.");
            return; // Exit the program if the number is not valid
        }

        // Define arrays for odd and even numbers with appropriate sizes
        int[] oddNumbers = new int[number / 2 + 1]; // Size to hold odd numbers
        int[] evenNumbers = new int[number / 2 + 1]; // Size to hold even numbers

        // Initialize index variables for odd and even numbers
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // If the number is even, store it in the evenNumbers array
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } 
			else {
                // If the number is odd, store it in the oddNumbers array
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Display the odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println(); // New line after odd numbers

        // Display the even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

    }
}
