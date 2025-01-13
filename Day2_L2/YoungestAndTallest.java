import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for Amar's age and height
        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = scanner.nextInt();
        
        // Input for Akbar's age and height
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = scanner.nextInt();
        
        // Input for Anthony's age and height
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = scanner.nextInt();
        
        // Find the youngest friend based on the smallest age
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar) {
            System.out.println("The youngest friend is Amar.");
        } else if (youngestAge == ageAkbar) {
            System.out.println("The youngest friend is Akbar.");
        } else {
            System.out.println("The youngest friend is Anthony.");
        }
        
        // Find the tallest friend based on the largest height
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar) {
            System.out.println("The tallest friend is Amar.");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("The tallest friend is Akbar.");
        } else {
            System.out.println("The tallest friend is Anthony.");
        }
    }
}
