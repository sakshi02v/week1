import java.util.Scanner;

public class Array2DTo1D {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array (matrix) based on user input for rows and columns
        int[][] matrix = new int[rows][cols];

        // Take user input to fill the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements from the 2D array
        int[] array1D = new int[rows * cols];
        int index = 0; // Variable to keep track of the index in the 1D array

        // Copy the elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1D[index] = matrix[i][j];
                index++; // Increment the index after each element is copied
            }
        }

        // Display the elements of the 1D array
        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < array1D.length; i++) {
            System.out.print(array1D[i] + " ");
        }
        System.out.println(); // New line after printing the 1D array
    }
}
