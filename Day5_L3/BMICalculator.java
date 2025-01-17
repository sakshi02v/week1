import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight (kg) and height (cm) of 10 members
        double[][] heightWeight = new double[10][2];

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter the weight (in kg) for person %d: ", i + 1);
            heightWeight[i][0] = scanner.nextDouble();
            System.out.printf("Enter the height (in cm) for person %d: ", i + 1);
            heightWeight[i][1] = scanner.nextDouble();
        }

        // Calculating BMI and status
        String[][] bmiResults = calculateBMIAndStatus(heightWeight);

        // Displaying the results
        displayResults(bmiResults);
    }

    // Method to calculate BMI and status
    public static String[][] calculateBMIAndStatus(double[][] heightWeight) {
        String[][] results = new String[heightWeight.length][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double heightInCm = heightWeight[i][1];
            double heightInMeters = heightInCm / 100; // Convert cm to meters

            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);

            // Determine BMI status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store height, weight, BMI, and status in results array
            results[i][0] = String.format("%.2f", heightInCm);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }

        return results;
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }
}
