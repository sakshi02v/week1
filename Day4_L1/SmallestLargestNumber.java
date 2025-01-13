import java.util.Scanner;

public class SmallestLargestNumber {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;

        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } 
		else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } 
		else {
            smallest = number3;
        }

        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } 
		else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } 
		else {
            largest = number3;
        }

        // Return the smallest and largest numbers in an array
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Calling findSmallestAndLargest method 
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

       
    }
}
