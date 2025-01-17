import java.util.Scanner;

public class Calendar {

    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        System.out.println("  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int count = 0;
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
            count++;
        }

        for (int i = 1; i <= days; i++) {
            System.out.printf("%4d", i);
            count++;
            if (count % 7 == 0) {
                System.out.println();
            }
        }

        if (count % 7 != 0) {
            System.out.println();
        }
    }

    public static String getMonthName(int month) {
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else {
            return daysInMonth[month - 1];
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDay(int month, int year) {
        // Gregorian calendar algorithm
        int y0 = (14 - month) / 12;
        int x = year - y0;
        int m0 = month + 12 * y0 - 2;
        int d0 = (x + x / 4 - x / 100 + x / 400 + (31 * m0) / 12) % 7;
        return d0;
    }
}