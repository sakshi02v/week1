import java.util.Arrays;

public class RandomNumberStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] 4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate random 4-digit number between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000; 
        }
        
        return numbers;
    }

    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        
        // Initialize min and max with the first element of the array
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // Calculate average
        double average = sum / (double) numbers.length;
        
        // Store results in the result array: [average, min, max]
        result[0] = average;
        result[1] = min;
        result[2] = max;
        
        return result;
    }

    public static void main(String[] args) {
        int size = 5; // Number of random numbers to generate
        
        // Generate array of 4-digit random numbers
        int[] randomNumbers = 4DigitRandomArray(size);
        
        // Find the average, min, and max values
        double[] stats = findAverageMinMax(randomNumbers);
        
        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        
        // Display the results
        System.out.println("Average value: " + stats[0]);
        System.out.println("Minimum value: " + stats[1]);
        System.out.println("Maximum value: " + stats[2]);
    }
}
