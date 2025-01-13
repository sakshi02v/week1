public class DiscountCalculator {
    public static void main(String[] args) {
       
        double Fee = 125000; // Original course fee in INR
        double discountRate = 10; // Discount rate in percentage
        
        // Calculate the discounted amount
        double discountAmount = (Fee * discountRate) / 100;
        
        // Calculate the discounted price (final price after applying discount)
        double discountedPrice = Fee - discountAmount;
        
        // Displaying results
        System.out.println("The discount amount is INR "+discountAmount+ " and final discounted fee is INR " + discountedPrice);
    }
}