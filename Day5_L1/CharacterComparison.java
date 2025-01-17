import java.util.Scanner;

public class CharacterComparison {

    // Method to return characters in a string by user defined method
    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays and return a boolean result
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        // Getting characters using user-defined method
        char[] customCharArray = getCharacters(text);
        
        // Getting characters using the built-in toCharArray() method
        char[] builtInCharArray = text.toCharArray();
        
        // Displaying the results
        System.out.println("Characters from user-defined method:");
        for (char c : customCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.println("Characters from toCharArray() method:");
        for (char c : builtInCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        // Comparing the two arrays
        if (compareCharArrays(customCharArray, builtInCharArray)) {
            System.out.println("Both character arrays are equal.");
        } else {
            System.out.println("The character arrays are different.");
        }

        scanner.close();
    }
}
