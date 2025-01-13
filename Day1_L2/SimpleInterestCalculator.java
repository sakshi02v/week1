import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Input Principal, Rate, and Time values from the user
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time period (in years): ");
        double time = input.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display Result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal 
                           + ", Rate of Interest " + rate + " and Time " + time + " years.");
    }
}
