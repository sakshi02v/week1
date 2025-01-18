import java.util.Scanner;

public class Fibonacci {

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        long first = 0, second = 1; // Starting numbers of the Fibonacci sequence

        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            long next = first + second; // Calculate the next term
            first = second; // Update for the next iteration
            second = next;
        }
        System.out.println(); // Print a newline after the sequence
    }

    // Main function to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Generate and print the Fibonacci sequence
        generateFibonacci(terms);
    }
}

