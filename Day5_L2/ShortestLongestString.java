import java.util.Scanner;

public class ShortestLongestString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Splitting text into words
        String[] words = splitTextIntoWords(inputText);

        // Calculating word lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Finding shortest and longest words
        int[] minMax = findShortestAndLongest(wordsWithLengths);

        // Displaying the results
        System.out.println("Shortest word: " + words[minMax[0]] + " with length " + wordsWithLengths[minMax[0]][1]);
        System.out.println("Longest word: " + words[minMax[1]] + " with length " + wordsWithLengths[minMax[1]][1]);
    }

    // Method to split text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        StringBuilder words = new StringBuilder();

        for (int i = 0; i < getStringLength(text); i++) {
            char c = text.charAt(i);

            if (Character.isWhitespace(c)) {
                if (word.length() > 0) {
                    words.append(word).append(" ");
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }

        if (word.length() > 0) {
            words.append(word);
        }

        return words.toString().split(" ");
    }

    // Method to find the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to get words with their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return wordsWithLengths;
    }

    // Method to find shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortestIndex = 0, longestIndex = 0;

        for (int i = 1; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
            int shortestLength = Integer.parseInt(wordsWithLengths[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordsWithLengths[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }
}
