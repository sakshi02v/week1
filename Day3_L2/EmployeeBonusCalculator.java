import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Define arrays to store salary, years of service, bonus, and new salary for each employee
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        
        Scanner sc = new Scanner(System.in);
        
        // Input loop for employee data
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            
            // Loop to ensure valid inputs are entered
            while (!validInput) {
                System.out.print("Enter the salary of employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                
                System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextInt();
                
                // Validate salary and years of service
                if (salary[i] > 0 && yearsOfService[i] >= 0) {
                    validInput = true;  // If valid, break out of the loop
                } 
				else {
                    System.out.println("Invalid input. Salary must be greater than 0 and years of service cannot be negative. Please try again.");
                }
            }
        }
        
        // Bonus calculation loop
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }
            
            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];
            
            // Accumulate total bonus and total salaries
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        // Output the results
        System.out.println("\nEmployee Bonus and Salary Information:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.println("  Old Salary: $" + String.format("%.2f", salary[i]));
            System.out.println("  Years of Service: " + yearsOfService[i]);
            System.out.println("  Bonus: $" + String.format("%.2f", bonus[i]));
            System.out.println("  New Salary: $" + String.format("%.2f", newSalary[i]));
        }
        
        // Print the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal Payout Information:");
        System.out.println("Total Bonus Payout: $" + String.format("%.2f", totalBonus));
        System.out.println("Total Old Salary: $" + String.format("%.2f", totalOldSalary));
        System.out.println("Total New Salary: $" + String.format("%.2f", totalNewSalary));
        
        
    }
}


