import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        // Check for February in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; // Assuming the day is 1st of the month

        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the name of the month and number of days
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the month and year header
        System.out.println("      " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print the initial spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d", day);

            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Print a new line for proper formatting
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }
}
