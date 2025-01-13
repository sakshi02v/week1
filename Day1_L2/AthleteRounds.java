import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangle from the user
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculating perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance the athlete wants to run is 5 km i.e. 5000 meters
        double totalDistance = 5000;

        // Calculating  number of rounds
        double rounds = totalDistance / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is: " + rounds);
    }
}