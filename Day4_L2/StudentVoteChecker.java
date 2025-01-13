import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
		return age >= 18;
    }

    public static void main(String[] args) {
        // Creating instance
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        // Loop to take input for all 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        // Check whether each student can vote and display the result
        for (int i = 0; i < 10; i++) {
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }

    }
}
