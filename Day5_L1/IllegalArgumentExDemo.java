import java.util.Scanner;

public class IllegalArgumentExDemo {

    public static void Exceptionhere(String input) {
        // Using substring with invalid indices to generate a RuntimeException
        // Start index is greater than the end index, which will cause StringIndexOutOfBoundsException
        String result = input.substring(5, 2);  // Invalid, as start index > end index
        System.out.println(result); 
    }

    // Method to demonstrate IllegalArgumentException and handle RuntimeException
    public static void handleException(String input) {
        try {
            
          Exceptionhere(input);
        } 
		catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: ");
        } 
		catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //taking input 

        System.out.print("Enter a string: ");     //prompt user
        String input = scanner.nextLine();
		try {
            Exceptionhere(input);
        } catch (Exception e) {
            System.out.println("Exception generated: " + e);
        }

        
		handleException(input);
		
        scanner.close();   //closing scanner
    }
}
