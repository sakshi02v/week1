import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();
        
        // Check if the employee qualifies for a bonus
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus if more than 5 years of service
        }
        
        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);
        

    }
}