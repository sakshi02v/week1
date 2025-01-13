import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Loop to find factors from 1 to number-1
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a factor of the number
                System.out.println(i);  // Print the factor
            }
        }
    }
}
