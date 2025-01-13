import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Create input object to read input
        Scanner input = new Scanner(System.in);

        // Taking input for first number from the user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Taking input for second number from the user
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Swapping the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display the result
        System.out.println("The swapped numbers are " + number1 + " and " + number2 + ".");
    }
}





