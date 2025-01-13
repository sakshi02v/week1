import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Run a for loop from 100 to 1
        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  // Check if i is a multiple of the number
                System.out.println(i);  // Print the multiple
            }
        }
    }
}
