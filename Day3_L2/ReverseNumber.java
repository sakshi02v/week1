import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a variable to store the number and take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        
        // Create an array to store the digits of the number
        int[] digits = new int[count];
        
        // Store the digits of the number in the array
        temp = number; // Re-initialize the number to extract digits again
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; // Get the last digit
            temp = temp / 10; // Remove the last digit
        }
        
        // Display the digits array in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println(); // Move to the next line after printing the reversed number
       
    }
}
