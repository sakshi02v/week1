import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate trigonometric functions (sin, cos, tan)
    public double[] calculateTrigonometricFunctions(double angle) {
        // Converting angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return the results in an array: [sine, cosine, tangent]
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Create an object of class
        TrigonometricFunctions functions = new TrigonometricFunctions();

        // Calling the method 
        double[] results = functions.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("For the angle of " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

    }
}
