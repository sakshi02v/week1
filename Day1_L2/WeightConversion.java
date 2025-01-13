import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input weight in pounds from the user
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // 1 pound = 2.2 kilograms
        double weightInKilograms = weightInPounds * 2.2;

        // Display output
        System.out.println("The weight of the person in pounds is " + weightInPounds 
                           + " and in kilograms is " + weightInKilograms);
    }
}
