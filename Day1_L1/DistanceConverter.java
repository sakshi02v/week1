import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Output the results
        System.out.printf("Distance in yards: %.2f yards\n", distanceInYards);
        System.out.printf("Distance in miles: %.6f miles\n", distanceInMiles);

        // Close the scanner
        scanner.close();
    }
}