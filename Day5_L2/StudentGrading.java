
import java.util.Random;

public class StudentGrading {

    public static void main(String[] args) {
        int numStudents = 10; // Change this value to the desired number of students

        // Generate random scores for all students
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Determine grades based on percentage
        char[][] grades = calculateGrades(results);

        // Display the scorecard in a tabular format
        displayScorecard(scores, results, grades);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random rand = new Random();

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100); // Generate random scores between 0 and 99
            }
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            results[i][0] = total; // Total marks
            results[i][1] = (double) total / 3; // Average marks
            results[i][2] = Math.round((double) total / 3 * 100 / 100); // Percentage (rounded to 2 decimal places)
        }

        return results;
    }

    // Method to calculate the grade based on the percentage
    public static char[][] calculateGrades(double[][] results) {
        char[][] grades = new char[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i][0] = 'A';
            } else if (percentage >= 70) {
                grades[i][0] = 'B';
            } else if (percentage >= 60) {
                grades[i][0] = 'C';
            } else if (percentage >= 50) {
                grades[i][0] = 'D';
            } else if (percentage >= 40) {
                grades[i][0] = 'E';
            } else {
                grades[i][0] = 'R';
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, char[][] grades) {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Grade");
        System.out.println("------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10c\n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], grades[i][0]);
        }

        System.out.println("------------------------------------------------------------------------------------");
    }
}