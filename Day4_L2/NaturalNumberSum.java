import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        // Base case: when n is 1, return 1
        if (n == 1) {
            return 1;
        } 
		else {
            // Recursive case: sum of n numbers = n + sum of first (n-1) numbers
            return n + sumRecursive(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number is not a natural number. Exiting.");
            return;
        }

        // Calculate the sum using recursion
        int recursiveSum = sumRecursive(n);

        // Calculate the sum using the formula
        int formulaSum = sumFormula(n);

        // Display both results
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers using the formula: " + formulaSum);

        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result .so,calculation is correct.");
        } 
		else {
            System.out.println("error in calculation");
        }

        scanner.close();
    }
}
