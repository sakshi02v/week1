import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Counting vowels and consonants
        int[] counts = countVowelsAndConsonants(input);

        // Displaying the results
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    // Method to check if a character is a vowel or consonant
    public static String checkCharType(char c) {
        // Convert to lowercase using ASCII values
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }

        // Check if it's a letter
        if (c >= 'a' && c <= 'z') {
            // Check if it's a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            String type = checkCharType(c);
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }
}
