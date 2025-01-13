import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input: Distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversion factors
        double feetInYard = 3;       // 1 yard = 3 feet
        double yardsInMile = 1760;   // 1 mile = 1760 yards

        // Convert the distance to yards and miles
        double distanceInYards = distanceInFeet / feetInYard;
        double distanceInMiles = distanceInYards / yardsInMile;

        // Output: The converted values
        System.out.println("The distance in yards is: " + distanceInYards);
        System.out.println("The distance in miles is: " + distanceInMiles);
    }
}