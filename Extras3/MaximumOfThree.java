import java.util.Scanner;

public class MaximumOfThree {

    // Function to take an integer input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to calculate the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a; // Assume the first number is the maximum
        if (b > max) {
            max = b; // Update max if the second number is greater
        }
        if (c > max) {
            max = c; // Update max if the third number is greater
        }
        return max;
    }

    // Main function to run the program
    public static void main(String[] args) {
        System.out.println("Enter three integers to find the maximum:");

        // Get three integer inputs from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        // Calculate the maximum value
        int maximum = findMaximum(num1, num2, num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + maximum);
    }
}
