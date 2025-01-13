import java.util.Scanner;

public class WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {
        // Using the provided formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = scanner.nextDouble();

            // Create an object of WindChillCalculator
            WindChillCalculator calculator = new WindChillCalculator();

            // Call the method 
            double windChill = calculator.calculateWindChill(temperature, windSpeed);

            // Output the result
            System.out.println("The wind chill temperature is: " + windChill + "°F");
        
		
    }
}
