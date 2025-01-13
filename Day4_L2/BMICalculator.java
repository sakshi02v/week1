import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // weight in kg
            double heightInCm = data[i][1];  // height in cm
            double heightInMeters = heightInCm / 100;  // convert cm to meters
            // BMI formula: BMI = weight / (height * height)
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;  // store the BMI in the third column of the array
        }
    }

    // Method to determine the BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];  // Get the BMI for each person

            // Determine BMI status
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a 2D array to store weight, height, and BMI of 10 persons
        double[][] data = new double[10][3]; // 10 persons, 3 columns: weight, height, BMI
        
        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            data[i][0] = scanner.nextDouble();  // weight in kg
            System.out.print("Height (in cm): ");
            data[i][1] = scanner.nextDouble();  // height in cm
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Get BMI status for each person
        String[] statuses = getBMIStatus(data);

        // Display the results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight (kg)", "Height (cm)", "BMI", "Status");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
