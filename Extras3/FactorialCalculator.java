import java.util.Scanner;

public class FactorialCalculator {

    // Recursive function to calculate factorial
    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return number * calculateFactorial(number - 1); // Recursive case
    }

    // Function to get input from the user
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        return scanner.nextInt();
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Main function to run the program
    public static void main(String[] args) {
        int number = getInput(); // Get input from the user
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number); // Calculate factorial using recursion
            displayResult(number, factorial); // Display the result
        }
    }
}
