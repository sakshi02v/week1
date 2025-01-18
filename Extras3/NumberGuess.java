import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static String getFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the guess correct? (yes, high, low): ");
        return scanner.nextLine().toLowerCase();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100 and I will try to guess it.");
        System.out.println("Respond with 'high' if my guess is too high, 'low' if my guess is too low, or 'yes' if I guessed it right.");

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);
            feedback = getFeedback();

            if (feedback.equals("yes")) {
                System.out.println("Yay! I guessed your number.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1; // Adjust high boundary
            } else if (feedback.equals("low")) {
                low = guess + 1; // Adjust low boundary
            } else {
                System.out.println("Invalid feedback, please respond with 'high', 'low', or 'yes'.");
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
