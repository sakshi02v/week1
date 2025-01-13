import java.util.*;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner input = new Scanner(System.in);

        // taking input in Celsius from the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Formula to convert Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
        double fahrenheit = (celsius * 9/5) + 32;

        // Output the result
        System.out.println("The "+ celsius + "celsius is" + fahrenheit + " fahrenheit");
    }
}