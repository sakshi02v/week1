import java.util.Scanner;

public class ChocolateDivision {

    // Method for chocolate distribution calculation
    public static int[] findChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // chocolates per child
        int remainingChocolates = numberOfChocolates % numberOfChildren; //leftover chocolates

        // Return both values in an array
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

            // Call the findChocolates method
            int[] result = findChocolates(numberOfChocolates, numberOfChildren);

            // Display the result
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
