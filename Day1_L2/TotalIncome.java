import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create input object to read input
        Scanner input = new Scanner(System.in);

        // Input salary from the user
        System.out.print("Enter the salary : ");
        double salary = input.nextDouble();

        // Input bonus from the user
        System.out.print("Enter the bonus : ");
        double bonus = input.nextDouble();

        // Calculating total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is  " + salary + " and bonus is  " + bonus + " Total Income is INR " + totalIncome + ".");
    }
}