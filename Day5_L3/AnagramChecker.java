import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store the frequency of characters in the first text
        int[] freq1 = new int[26]; // Assuming only lowercase letters

        // Calculate the frequency of characters in the first text
        for (char c : text1.toCharArray()) {
            freq1[c - 'a']++;
        }

        // Create an array to store the frequency of characters in the second text
        int[] freq2 = new int[26]; // Assuming only lowercase letters

        // Calculate the frequency of characters in the second text
        for (char c : text2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // Compare the frequency of characters in the two texts
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine().toLowerCase();

        if (areAnagrams(text1, text2)) {
            System.out.println(text1 + " and " + text2 + " are anagrams.");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams.");
        }
    }
}