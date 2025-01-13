import java.util.Scanner;

public class BMI_Calculator2 {

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking the number of persons as input
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        
        // Multi-dimensional array to store weight, height, and BMI for each person
        double[][] personData = new double[number][3];  // personData[i][0] = weight, personData[i][1] = height, personData[i][2] = BMI
        String[] weightStatus = new String[number]; // Array to store weight status

        // Taking input for weight and height of each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            // Input weight with validation
            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight should be positive. Please enter again.");
                }
            } while (weight <= 0);
            
            // Input height with validation
            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height should be positive. Please enter again.");
                }
            } while (height <= 0);
            
            // Store weight and height in the personData array
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI and store it in the personData array
            personData[i][2] = weight / (height * height);

            // Determine the weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Displaying the results
        System.out.println("\nDetails of each person:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-15s%-15s\n", "Person", "Weight", "Height", "BMI", "Weight Status");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d%-10.2f%-10.2f%-15.2f%-15s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
		
    }
}
