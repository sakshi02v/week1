import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        
            // Calculate the number of chocolates each child gets
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;

            // Calculate the remaining chocolates
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Display the result
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild 
                               + " and the number of remaining chocolates are " + remainingChocolates);
        
            System.out.println("The number of children must be greater than 0.");
        
    }
}
