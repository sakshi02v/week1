import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = calculateSI(principal, rate, time);

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);

        scanner.close();
    }
}
