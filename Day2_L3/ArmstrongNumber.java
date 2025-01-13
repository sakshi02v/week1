import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize variables
        int sumOfCubes = 0;
        int originalNumber = number;
        
        // Loop to find the sum of cubes of each digit
        while (originalNumber != 0) {
            // Get the last digit using modulus operator
            int digit = originalNumber % 10;
            
            // Cube the digit and add it to the sum
            sumOfCubes += Math.pow(digit, 3);
            
            // Remove the last digit using integer division
            originalNumber /= 10;
        }
        
        // Check if the sum of cubes equals the original number
        if (sumOfCubes == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    
    }
}
