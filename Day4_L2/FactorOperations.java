import java.util.Scanner;

public class FactorOperations {

    // Method to find the factors of the number and return them in an array
    public static int[] findFactors(int number) {
        // First, count how many factors there are
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors using Math.pow() method
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); // Math.pow(factor, 2) calculates the square of the factor
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the input number from the user
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Call the method to find factors
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("The factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display the sum of the factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of the factors: " + sum);

        // Calculate and display the product of the factors
        int product = productOfFactors(factors);
        System.out.println("Product of the factors: " + product);

        // Calculate and display the sum of squares of the factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of the factors: " + sumOfSquares);

    }
}
