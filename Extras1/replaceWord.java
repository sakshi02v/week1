public class replaceWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String wordToReplace = "fox";
        String replacementWord = "cat";

        String updatedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Updated Sentence: " + updatedSentence);
    }

    
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Use regex to match whole words only, case-sensitive
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}
