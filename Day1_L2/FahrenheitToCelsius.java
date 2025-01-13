import java.util.*;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner input = new Scanner(System.in);

        // taking input in fahrenheit from the user
        System.out.print("Enter temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Formula to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C 
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Output the result
        System.out.println("The "+ fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }
}