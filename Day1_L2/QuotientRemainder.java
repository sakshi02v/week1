import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Creating input object to take input from user
        Scanner input = new Scanner(System.in);

        // Input: Two numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Calculate the quotient and remainder
        int quotient = num1 / num2;   // Division operator for quotient
        int remainder = num1 % num2;  // Modulus operator for remainder

        // display the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2 + ".");
    }
}