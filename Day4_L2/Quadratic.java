import java.util.Scanner;

public class Quadratic {
    
    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Delta is the discriminant: delta = b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // Case 1: If delta is positive, there are two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        }
        
        // Case 2: If delta is zero, there is exactly one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }
        
        // Case 3: If delta is negative, there are no real roots
        else {
            return new double[] {}; // No real roots
        }
    }
    
    public static void main(String[] args) {
        // Take input for a, b, and c from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        // Calling method to find the roots
        double[] roots = findRoots(a, b, c);
        
        // Output the roots
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } 
		else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }
        
        scanner.close();
    }
}
