import java.util.Scanner;

public class FactorialForloop{
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the entered number is a positive integer
        if (number < 0) {
            System.out.println("Please enter a valid positive integer.");
        } 
		else {
            // Compute the factorial using a for loop
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i at each step
            }
            
            // Display the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        
    }
}
