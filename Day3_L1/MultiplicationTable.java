import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
		
        // input object to take user input
        Scanner input= new Scanner(System.in);

        // Get the number for which we need to print the multiplication table
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the multiplication results (from 1 to 10)
        int[] multiplicationTable = new int[10];

        // Calculate the multiplication table and store results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i-1] = number * i;
        }

        // Display the multiplication table
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
		
    }
}
