import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Creating a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the countdown start value
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        
        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter by 1
        }
        
        System.out.println("Launch!");
       
    }
}