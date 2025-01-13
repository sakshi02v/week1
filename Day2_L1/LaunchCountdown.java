import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Creating a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the countdown start value
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        
        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("Launch!");
       
    }
}