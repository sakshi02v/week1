import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        // Generate random ages for students
        int[] studentAges = generateRandomAges(n);

        // Check voting eligibility
        String[][] ageEligibility = checkVotingEligibility(studentAges);

        // Display results in tabular format
        displayResults(ageEligibility);
    }

    // Method to generate random ages for students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(100); // Generate random ages between 0 and 99
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                results[i][1] = "Cannot Vote (Invalid Age)";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }

        return results;
    }

    // Method to display the results in tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s %-20s%n", "Age", "Eligibility");
        System.out.println("------------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-20s%n", row[0], row[1]);
        }
    }
}
