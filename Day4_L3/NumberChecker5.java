import java.math.BigInteger;

public class NumberChecker {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int[] tempFactors = new int[number]; // Array to store potential factors
        int count = 0;

        // Find factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                tempFactors[count++] = i;
            }
        }

        // Create the factors array with exact size
        int[] factors = new int[count];
        System.arraycopy(tempFactors, 0, factors, 0, count);
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = factors[0];
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }

    // Method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube of the factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum == number; // Perfect number is equal to the sum of its proper divisors
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum > number; // Abundant number has a sum of proper divisors greater than the number itself
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum < number; // Deficient number has a sum of proper divisors less than the number itself
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorials = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfFactorials += factorial(digit);
            tempNumber /= 10;
        }

        return sumOfFactorials == number; // Strong number is equal to the sum of the factorials of its digits
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // Example number to test
        int number = 28;

        // Find factors
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor: " + greatestFactor);

        // Sum of factors
        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);

        // Product of factors
        int productOfFactors = productOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        // Product of cubes of factors
        double productOfCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);

        // Check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is " + number + " a perfect number? " + isPerfect);

        // Check if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is " + number + " an abundant number? " + isAbundant);

        // Check if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is " + number + " a deficient number? " + isDeficient);

        // Check if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is " + number + " a strong number? " + isStrong);
    }
}
