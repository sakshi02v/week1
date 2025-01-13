public class UnitConversion {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method for testing
    public static void main(String[] args) {
        // initializing example values
        double yards = 10.0;
        double feet = 30.0;
        double meters = 5.0;
        double inches = 20.0;

        // Convert yards to feet
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");

        // Convert feet to yards
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");

        // Convert meters to inches
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");

        // Convert inches to meters
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");

        // Convert inches to centimeters
        System.out.println(inches + " inches is equal to " + convertInchesToCm(inches) + " centimeters.");
    }
}
