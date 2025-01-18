import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to get user input
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to display the result
    public static void displayResult(String conversionType, double input, double result) {
        System.out.printf("The %s conversion result is: %.2f%n", conversionType, result);
    }

    // Main function to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter:");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double fahrenheit = getInput("Enter temperature in Fahrenheit: ");
                double celsius = fahrenheitToCelsius(fahrenheit);
                displayResult("Fahrenheit to Celsius", fahrenheit, celsius);
                break;
            case 2:
                double celsiusInput = getInput("Enter temperature in Celsius: ");
                double fahrenheitResult = celsiusToFahrenheit(celsiusInput);
                displayResult("Celsius to Fahrenheit", celsiusInput, fahrenheitResult);
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }
    }
}
