import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Part 1: Using Multiple if-else Statements
        if (year >= 1582) {  // Check for valid year in the Gregorian calendar
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            }
			else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } 
			else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
			else {
                System.out.println(year + " is not a Leap Year");
            }
        } 
		else {
            System.out.println("Year should be 1582 or later to be in the Gregorian calendar.");
        }
        
        
	
    }
}
