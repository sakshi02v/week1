import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking the number of persons as input
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        
        // Arrays to store weight, height, BMI, and weight status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] weightStatus = new String[n];

        // Taking input for weight and height of each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();
        }

        // Calculating BMI and weight status for each person
        for (int i = 0; i < n; i++) {
            // BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Displaying the results
        System.out.println("\nDetails of each person:");
        System.out.printf("%-10s%-10s%-10s%-15s%-15s\n", "Person", "Weight", "Height", "BMI", "Weight Status");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d%-10.2f%-10.2f%-15.2f%-15s\n", (i + 1), weight[i], height[i], bmi[i], weightStatus[i]);
        }

    }
}
