import java.util.Scanner;

public class TextSplitterAndLength {

    // Method to manually split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        // Using a StringBuilder to store words
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            if (currentChar == ' ' || i == text.length() - 1) {
                // If a space is encountered or it's the last character
                if (i == text.length() - 1 && currentChar != ' ') {
                    word.append(currentChar); // Append last word character
                }
                result.append(word.toString()).append(" "); // Add word to result
                word = new StringBuilder(); // Reset word for next iteration
            } else {
                word.append(currentChar); // Append character to current word
            }
        }
        
        // Convert StringBuilder to array of words
        return result.toString().split(" "); // Final result as an array
    }

    // Method to find and return the length of a string without using length()
    public static int findLengthOfString(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return length; // Return the length of the word
    }

    // Method to create a 2D array containing words and their corresponding lengths
    public static String[][] create2DArrayOfWordsAndLengths(String[] words) {
        String[][] wordLengthArray = new String[words.length][2]; // 2D array with words and their lengths
        
        for (int i = 0; i < words.length; i++) {
            int length = findLengthOfString(words[i]);
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = String.valueOf(length); // Length as String
        }
        
        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a sentence: ");
        String inputText = sc.nextLine();

        // Split the text into words using custom method
        String[] words = splitTextIntoWords(inputText);

        // Create the 2D array with words and their corresponding lengths
        String[][] wordLengthArray = create2DArrayOfWordsAndLengths(words);

        // Display the result in a tabular format
        System.out.println("Word\t\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            // Convert the length from String to Integer and display
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(wordLengthArray[i][0] + "\t\t" + length);
        }

        sc.close(); // Closing the scanner
    }
}
