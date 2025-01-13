import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Input the number from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize count to 0
        int count = 0;
        
        // Using a loop to count the digits
        while (number != 0) {
            // Remove the last digit from the number using integer division
            number /= 10;
            
            // Increment the count by 1 for each digit removed
            count++;
        }
        
        // Display the result
        System.out.println("The number has " + count + " digits.");
        
    }
}
