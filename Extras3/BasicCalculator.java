import java.util.Scanner;

public class BasicCalculator {

    // Function to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to perform division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return NaN if division by zero
        }
        return a / b;
    }

    // Function to get user input
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to display the result
    public static void displayResult(String operation, double result) {
        System.out.println("The result of the " + operation + " is: " + result);
    }

    // Main function to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator:");
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");
        double result = 0;
        
        switch (choice) {
            case 1:
                result = add(num1, num2);
                displayResult("addition", result);
                break;
            case 2:
                result = subtract(num1, num2);
                displayResult("subtraction", result);
                break;
            case 3:
                result = multiply(num1, num2);
                displayResult("multiplication", result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) { // Only display result if no division by zero
                    displayResult("division", result);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
                break;
        }
    }
}
