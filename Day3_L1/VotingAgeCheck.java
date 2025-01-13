import java.util.Scanner;

public class VotingAgeCheck {
    public static void main(String[] args) {
	
        // sc object to take user input
        Scanner sc = new Scanner(System.in);

        // array declaration to store the ages of 10 students
        int[] ages = new int[10];

        // prompt user to input the ages of the 10 students
        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Loop through the array to check if the students can vote
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            
            if (age < 0) {
                System.out.println("Invalid age entered for student " + (i + 1));
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }

       
    }
}
