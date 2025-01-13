import java.util.Random;

public class MeanHeight {

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return sum / (double) heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Array to store the heights of 11 players
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250 cm for each player
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;  // Random value between 150 and 250
        }

        // Display the heights of all players
        System.out.println("Heights of the players (in cms):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate and display the results
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        System.out.println("\nResults:");
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
