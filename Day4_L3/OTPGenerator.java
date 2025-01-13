import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random 6-digit number
        int otp = (int) (Math.random() * 900000) + 100000; // Ensures the number is between 100000 and 999999
        return otp;
    }

    // Method to check if all OTPs generated are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        // Using a HashSet to ensure uniqueness of OTPs
        HashSet<Integer> otpSet = new HashSet<>();
        
        for (int otp : otpArray) {
            otpSet.add(otp); // Adds OTP to the set (duplicates will be ignored)
        }
        
        // If the size of the set equals the length of the array, then all OTPs are unique
        return otpSet.size() == otpArray.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10]; // Array to store 10 OTPs
        
        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check if the OTPs are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are duplicated.");
        }
    }
}
