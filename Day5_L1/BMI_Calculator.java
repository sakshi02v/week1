import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        // BMI formula: weight (kg) / (height (m))^2
        return weight / (height * height);
    }

    // Method to determine BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to calculate BMI and status for all persons and store in a 2D String array
    public static String[][] computeBMIStatus(double[][] personData) {
        // Array to store height, weight, BMI and status for each person
        String[][] result = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            // Calculate BMI
            double bmi = calculateBMI(weight, height);
            // Determine BMI status
            String status = determineStatus(bmi);
            // Store the results in the 2D result array
            result[i][0] = String.format("%.2f", weight);
            result[i][1] = String.format("%.2f", height);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a 2D array to store weight and height for 10 persons
        double[][] personData = new double[10][2];
        
        // Get user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
        }

        // Compute BMI and status for each person
        String[][] bmiStatus = computeBMIStatus(personData);

        // Display the results
        System.out.println("\nPerson No. | Weight (kg) | Height (cm) | BMI    | Status");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "          | " + bmiStatus[i][0] + "       | " + bmiStatus[i][1] + "      | " + bmiStatus[i][2] + " | " + bmiStatus[i][3]);
        }

        scanner.close();
    }
}
