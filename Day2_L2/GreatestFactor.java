import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize the greatestFactor variable to 1
        int greatestFactor = 1;
        
        // Loop from number-1 down to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {  // Check if i is a factor of the number
                greatestFactor = i;  // Assign the factor to greatestFactor
                break;  // Break the loop as we found the greatest factor
            }
        }
        
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);
    }
}
