import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        //scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Define an array of 10 elements of type double
        double[] numbers = new double[10];

        // Define a variable to store the total and initialize it to 0.0
        double total = 0.0;

        // Initialize the index variable to 0
        int index = 0;

        // Infinite while loop to keep taking user input
        while (true) {
            // Take user input
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();

            // Check if the number is 0 or negative or if the index exceeds 10
            if (input <= 0 || index == 10) {
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Display the numbers entered by the user
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Calculate the sum of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the total sum
        System.out.println("Total sum of numbers: " + total);
        
    }
}


