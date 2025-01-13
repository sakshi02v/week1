import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // sc object to take user input
        Scanner sc = new Scanner(System.in);

        // Define an array to store the heights of the players (size 11)
        double[] heights = new double[11];

        // Take user input for the heights of 11 players
        System.out.println("Enter the heights of the 11 players (in meters):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
        }

        // Calculate the sum of all elements in the heights array
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Display the mean height of the football team
        System.out.println("The mean height of the football team is: " + mean + " meters");

    }
}
