import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize total as 0.0
        double total = 0.0;
        
        // Variable to store the user's input
        double number;
        
        // Ask the user for input until they enter 0
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            number = scanner.nextDouble();
            
            // If the number is not 0, add it to total
            if (number != 0) {
                total += number;
            }
        } while (number != 0);  // Loop continues until 0 is entered
        
        // Display the total value
        System.out.println("Total sum: " + total);
       
    }
}