import java.util.Scanner;

public class GCDLCMCalculator {

    // Function to calculate the GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
      
    // Function to calculate the LCM using the relationship: LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Function to get user input
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to display the results
    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }

    // Main function to coordinate the program
    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        int gcd = calculateGCD(num1, num2); // Calculate GCD
        int lcm = calculateLCM(num1, num2); // Calculate LCM

        displayResults(num1, num2, gcd, lcm); // Display the results
    }
}

