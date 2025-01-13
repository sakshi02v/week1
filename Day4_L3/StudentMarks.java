import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        int[][] results = calculateTotalAveragePercentage(scores);

        displayScorecard(scores, results);
    }

    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 100); // Generate random scores between 0 and 99
            }
        }
        return scores;
    }

    public static int[][] calculateTotalAveragePercentage(int[][] scores) {
        int[][] results = new int[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            results[i][0] = total;
            results[i][1] = Math.round(total / 3.0f); // Round average to nearest integer
            results[i][2] = Math.round((total / 300.0f) * 100); // Round percentage to nearest integer
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, int[][] results) {
        System.out.println("--------------------------------------------------");
        System.out.println("| Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade | Remarks                                  |");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(results[i][2]);
            String remarks = getRemarks(grade);
            System.out.printf("| %-7d | %-7d | %-9d | %-4d | %-5d | %-7d | %-10d | %-4s | %-35s |\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grade, remarks);
        }
        System.out.println("--------------------------------------------------");
    }

    public static String getGrade(int percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static String getRemarks(String grade) {
        switch (grade) {
            case "A":
                return "Level 4, above agency-normalized standards";
            case "B":
                return "Level 3, at agency-normalized standards";
            case "C":
                return "Level 2, below, but approaching agency-normalized standards";
            case "D":
                return "Level 1, well below agency-normalized standards";
            case "E":
                return "Level 1-, too below agency-normalized standards";
            case "R":
                return "Remedial standards";
            default:
                return "";
        }
    }
}