import java.util.*;

public class DoubleOperation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take input values of a, b, and c from the user
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
		
        double result1 = a + b * c;      
        double result2 = a * b + c;      
        double result3 = c + a / b;      
        double result4 = a % b + c;      
		
        // display the results
        System.out.println("The result of a + b * c is: " + result1);
        System.out.println("The result of a * b + c is: " + result2);
        System.out.println("The result of c + a / b is: " + result3);
        System.out.println("The result of a % b + c is: " + result4);
    }
}