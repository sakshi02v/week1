import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Create arrays to store the ages and heights of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        
        Scanner sc = new Scanner(System.in);
        
        // Take user input for age and height for the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            
            System.out.print("Enter height of " + friends[i] + " in meters: ");
            heights[i] = sc.nextDouble();
        }
        
        // Initialize variables to track the youngest and tallest
        int youngestAge = ages[0];
        double tallestHeight = heights[0];
        String youngestFriend = friends[0];
        String tallestFriend = friends[0];
        
        // Loop through the arrays to find the youngest and the tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }
        
        // Output the results
        System.out.println("\nThe youngest friend is " + youngestFriend + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " meters.");
        
     
    }
}
