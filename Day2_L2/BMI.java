import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from cm to meters
        double heightM = heightCm / 100;
        
        // Calculate BMI using the formula BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);
        
        // Output the BMI result
        System.out.printf("Your BMI is: %.2f\n", bmi);
        
        // Determine the weight status based on BMI value
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have Normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You have Obesity.");
        }
    }
}
