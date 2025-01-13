import java.util.Scanner;

public class AthleteRounds {

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3; // Perimeter = sum of all sides
    }

    // Method to calculate the number of rounds to complete 5 kilometers
    public static int calculateRounds(double perimeter) {
        double distanceToRun = 5000; // 5 km = 5000 meters
        return (int) Math.ceil(distanceToRun / perimeter); // Rounds = total distance / perimeter
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the length of side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        //perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        //total no. of rounds
        int rounds = calculateRounds(perimeter);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }
}
