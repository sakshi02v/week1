public class EarthVolumeCalculator {
    public static void main(String[] args) {
        
        double radiusKm = 6378; // Radius of Earth in kilometers
        double pi = Math.PI; // Using Math.PI for a precise value of pi
        
        // Volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        
        // Conversion factor: 1 km^3 = (0.621371)^3 miles^3
        double conversionFactor = Math.pow(0.621371, 3);
        
        // Volume of Earth in cubic miles
        double volumeMiles3 = volumeKm3 * conversionFactor;
        
        // Displaying the results
        System.out.println("The volume of Earth in cubic kilometers is "+ volumeKm3+" and in miles is "+volumeMiles3 );
        
    }
}