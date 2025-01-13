import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes using the combination formula
    public static int calculateHandshakes(int n) {
	
        // Formula :( n * (n - 1)) / 2
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
		
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(n);

            // Display the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);

    }
}
