import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the number for which the multiplication table is to be displayed
        System.out.print("Enter a number between 6 and 9: ");
        int number = scanner.nextInt();

        // Check if the entered number is between 6 and 9
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            return; // Exit the program if the input is invalid
        }

        // Define an array to store the multiplication results
        int[] multiplicationResult = new int[10];

        // Calculate the multiplication table for the number and store it in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // Displaying multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
        }

        
    }
}
