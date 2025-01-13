import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } 
		else {
            // Compute sum using while loop
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }
            
            // Compute sum using the formula n*(n+1)/2
            int sumFormula = n * (n + 1) / 2;
            
            // Compare both results
            System.out.println("Sum using while loop: " + sumWhileLoop);
            System.out.println("Sum using formula: " + sumFormula);
            
            // Check if both sums are equal
            if (sumWhileLoop == sumFormula) {
                System.out.println("Both computations are correct!");
            }
        else {
                System.out.println("There is an error in the computations.");
            }
        }
        
 
    }
}