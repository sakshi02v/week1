import java.util.Scanner;

public class DistanceLineEquation {

    // Method to calculate the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the equation of the line given two points (x1, y1) and (x2, y2)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b)
        double b = y1 - m * x1;

        // Return the slope and y-intercept as an array
        return new double[]{m, b};
    }

    // Method to format the equation of the line as a string
    public static String formatLineEquation(double m, double b) {
        // Format the slope and y-intercept to be more readable
        return "y = " + m + "x + " + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Coordinates of two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        // Calculate the line equation
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];

        // Format and display the line equation
        String equation = formatLineEquation(slope, intercept);
        System.out.println("The equation of the line is: " + equation);

        scanner.close();
    }
}
