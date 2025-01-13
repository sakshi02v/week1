import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
		
		// Part 2: Using a Single if Statement with Logical Operators
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year");
        } else {
            System.out.println("Year should be 1582 or later to be in the Gregorian calendar.");
        }
	}
}