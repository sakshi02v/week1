import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        // combination = (n * (n - 1)) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes is: " + handshakes);
    }
}