import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Using a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
       
    }
}