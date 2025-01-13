public class NumberChecker4 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        // Calculate the sum of digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    public static void main(String[] args) {
        // Example numbers to check
        int number1 = 37;
        int number2 = 9;
        int number3 = 12;
        int number4 = 25;
        int number5 = 17;

        // Check if number1 is prime
        System.out.println("Is " + number1 + " prime? " + isPrime(number1));

        // Check if number2 is neon
        System.out.println("Is " + number2 + " a neon number? " + isNeonNumber(number2));

        // Check if number3 is a spy number
        System.out.println("Is " + number3 + " a spy number? " + isSpyNumber(number3));

        // Check if number4 is an automorphic number
        System.out.println("Is " + number4 + " an automorphic number? " + isAutomorphicNumber(number4));

        // Check if number5 is a buzz number
        System.out.println("Is " + number5 + " a buzz number? " + isBuzzNumber(number5));
    }
}
