import java.util.Random;

public class EmployeeBonus {

    // Method to generate the salary and years of service for each employee
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] employeeData = new int[10][2]; // 10 employees, each having salary and years of service
        
        // Generate random salary (5-digit salary) and years of service (1 to 20 years)
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = rand.nextInt(90000) + 10000; // Salary between 10000 and 99999
            employeeData[i][1] = rand.nextInt(20) + 1; // Years of service between 1 and 20
        }
        return employeeData;
    }

    // Method to calculate the new salary and bonus for each employee based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] employeeNewData = new double[10][3]; // 10 employees, each having new salary, bonus, and old salary
        
        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus;
            double newSalary;
            
            // If years of service is more than 5, bonus is 5%, otherwise 2%
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }
            
            newSalary = oldSalary + bonus; // New salary is old salary + bonus
            
            // Store old salary, bonus, and new salary in the new array
            employeeNewData[i][0] = oldSalary;
            employeeNewData[i][1] = bonus;
            employeeNewData[i][2] = newSalary;
        }
        
        return employeeNewData;
    }

    // Method to calculate and display the sum of old salaries, new salaries, and total bonus
    public static void calculateAndDisplaySums(double[][] employeeNewData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        // Calculate the totals
        for (int i = 0; i < 10; i++) {
            totalOldSalary += employeeNewData[i][0];
            totalBonus += employeeNewData[i][1];
            totalNewSalary += employeeNewData[i][2];
        }
        
        // Display the table
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Bonus", "New Salary", "Years of Service");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-15d %-15.2f %-15.2f %-15d\n", i + 1, (int) employeeNewData[i][0], employeeNewData[i][1], employeeNewData[i][2], (int) (employeeNewData[i][0] / 10000)); // Years of service is based on the salary value range
        }
        
        // Display the total sums
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        int[][] employeeData = generateEmployeeData();
        
        // Calculate the new salary and bonus
        double[][] employeeNewData = calculateBonusAndNewSalary(employeeData);
        
        // Calculate and display the totals and detailed information
        calculateAndDisplaySums(employeeNewData);
    }
}
