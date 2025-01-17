import java.util.Scanner;

public class StringLength {

    // Method to calculate string length without using length() method
    public static int calculateStringLength(String str) {
        int length = 0;
        try {
            // Infinite loop to count characters
            while (true) {
                str.charAt(length); 
                length++; // Increment length for each valid character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when we go past the last character
            // Handle exception and return the length
            return length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string: ");
        String inputString = scanner.next();

        int customLength = calculateStringLength(inputString);

        // Display results
        System.out.println("Length calculated without using length() method: " + customLength);
        System.out.println("Length using built-in length() method: " + inputString.length());

        scanner.close();
    }
}
