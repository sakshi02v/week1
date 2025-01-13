import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        // Create a variable to store the number and take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Define the maximum digit size and array to store the digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        
        // Initialize variables
        int index = 0;
        int largest = -1; // Smallest possible value since digits are from 0 to 9
        int secondLargest = -1;
        
        // Extract digits from the number and store them in the array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; // Get the last digit
            number = number / 10; // Remove the last digit
            index++;
        }
        
        // Loop through the digits array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }
        
        // Output the results
        if (secondLargest == -1) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
        
    }
}
