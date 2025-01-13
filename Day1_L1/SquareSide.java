import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input: Perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Formula to find the side of the square: side = perimeter / 4
        double side = perimeter / 4;

        // Output: The length of the side
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter + ".");
    }
}