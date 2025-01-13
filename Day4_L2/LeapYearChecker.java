import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean LeapYearcheck(int year) {
        // Check if the year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582) {
            // A year is a leap year if it is divisible by 4, but not divisible by 100,
            // or if it is divisible by 400.
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true; 
            } else {
                return false;
            }
        } 
		else {
            System.out.println("The year must be 1582 or later (Gregorian calendar).");
            return false;
        }
    }

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
		
        if (LeapYearcheck(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

    }
}
