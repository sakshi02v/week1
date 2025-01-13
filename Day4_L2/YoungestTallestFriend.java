import java.util.Scanner;

public class YoungestTallestFriend {

    // Method to find the youngest among the 3 friends based on their ages
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar";

        // Check the youngest age and corresponding name
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        if (ages[2] < minAge) {
            minAge = ages[2];
            youngest = "Anthony";
        }

        return youngest;
    }

    // Method to find the tallest among the 3 friends based on their heights
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallest = "Amar";

        // Check the tallest height and corresponding name
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        if (heights[2] > maxHeight) {
            maxHeight = heights[2];
            tallest = "Anthony";
        }

        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store age and height of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for ages of Amar, Akbar, and Anthony
        System.out.print("Enter age of Amar: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter age of Akbar: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter age of Anthony: ");
        ages[2] = scanner.nextInt();

        // Take user input for heights of Amar, Akbar, and Anthony
        System.out.print("Enter height of Amar (in meters): ");
        heights[0] = scanner.nextDouble();
        System.out.print("Enter height of Akbar (in meters): ");
        heights[1] = scanner.nextDouble();
        System.out.print("Enter height of Anthony (in meters): ");
        heights[2] = scanner.nextDouble();

        // Find and display the youngest and tallest friend
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

  
    }
}
