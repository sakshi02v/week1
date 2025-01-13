import java.util.Scanner;

public class CollinearPoints {

    // Method to check if three points are collinear using the slope formula
    public static boolean arePointsCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes AB and BC
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        // Calculate slope AC
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        // If all slopes are equal, the points are collinear
        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area using the formula
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If the area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the three points
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();
        System.out.print("Enter x3: ");
        int x3 = scanner.nextInt();
        System.out.print("Enter y3: ");
        int y3 = scanner.nextInt();

        // Check if points are collinear using slope formula
        if (arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Check if points are collinear using area formula
        if (arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the area formula.");
        } else {
            System.out.println("The points are not collinear using the area formula.");
        }

        scanner.close();
    }
}
