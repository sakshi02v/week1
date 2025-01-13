import java.util.Scanner;

public class Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 
 {

    // Method to find the quotient and remainder of a division
    public static int[] RemainderQuotient(int number, int divisor) {
        int quotient = number / divisor;  
        int remainder = number % divisor; 

        // Return both quotient and remainder in an array
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// Take input
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

            // Call the findRemainderAndQuotient method
            int[] result = RemainderQuotient(number, divisor);

            // Display results
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

    }
}
