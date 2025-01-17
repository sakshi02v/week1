import java.util.*;

public class TextSplitter {

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord = new StringBuilder();
                }
            } else {
                currentWord.append(ch);
            }
        }

        // Add the last word if it exists
        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        return words.toArray(new String[0]);
    }

    // Method to find the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to return a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String inputText = scanner.nextLine();

        // Call methods to process the input
        String[] words = splitText(inputText);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("--------------");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println(wordWithLength[0] + "\t" + Integer.parseInt(wordWithLength[1]));
        }

        scanner.close();
    }
}
