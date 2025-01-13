import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // sc object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the entered number is valid (greater than 0)
        if (number <= 0) {
            System.out.println("Please enter a valid positive number.");
            return; // Exit if the number is not valid
        }

        
        int[] factors = new int[number];
        int index = 0; // To keep track of the index in the factors array

        // Loop through numbers from 1 to the number to find the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                
                factors[index] = i;
                index++;
            }
        }

        // Display the factors of the number
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); // New line after the output

    }
}
