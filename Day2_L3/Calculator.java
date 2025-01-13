import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declare the variables
        double first, second;
        String op;

        // Get input from the user
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();
        
        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();
        
        // Perform the calculation based on the operator using switch...case
        double result = 0;
        boolean validOperator = true;

        // Using a loop to iterate through operations (though only one operation will be executed)
        for (int i = 1; i < 2; i++) { // Loop is from i = 1 to i < 2, essentially runs once
            switch (op) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second != 0) {
                        result = first / second;
                    } else {
                        System.out.println("Error: Division by zero.");
                        validOperator = false;
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
                    validOperator = false;
                    break;
            }
        }

        // If the operator was valid, print the result
        if (validOperator) {
            System.out.println("The result of " + first + " " + op + " " + second + " is: " + result);
        }
    }
}
