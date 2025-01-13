import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Input the number from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Create an integer variable sum with initial value 0
        int sum = 0;
        
        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Check if sum is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

    }
}
