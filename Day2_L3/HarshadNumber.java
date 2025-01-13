import java.util.Scanner;
import java.itil.*;
public class HarshadNumber {
    public static void main(String[] args) {
        // scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Input the number from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Create an integer variable sum with initial value 0
        int sum = 0;
        int originalNumber = number;  // Store the original number
        
        // Create a while loop to access each digit of the number
        while (number != 0) {
            // Add each digit of the number to sum
            sum += number % 10;
            
            // Remove the last digit from the number
            number /= 10;
        }
        
        // Check if the number is perfectly divisible by the sum
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }
    }
}
