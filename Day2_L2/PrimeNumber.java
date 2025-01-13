import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is prime
        boolean isPrime = true;  // Assume the number is prime initially
        
        // Prime number checks are done for numbers greater than 1
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            // Loop from 2 to number - 1
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;  // If divisible by any number other than 1 and itself
                    break;  // Exit the loop early as it's already not prime
                }
            }
        }
        
        // Output result based on isPrime value
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}
