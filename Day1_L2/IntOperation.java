import java.util.*;

public class IntOperation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take input values of a, b, and c from the user
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
		
        int result1 = a + b * c;      
        int result2 = a * b + c;      
        int result3 = c + a / b;      
        int result4 = a % b + c;      
		
        // display the results
        System.out.println("The result of a + b * c is: " + result1);
        System.out.println("The result of a * b + c is: " + result2);
        System.out.println("The result of c + a / b is: " + result3);
        System.out.println("The result of a % b + c is: " + result4);
    }
}