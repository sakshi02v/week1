import java.util.*;
public class Substring {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
        String text = sc.next();
		System.out.println("Enter starting index");
		int startIndex=sc.nextInt();
		System.out.println("Enter ending index");
		int lastIndex=sc.nextInt();
        
        // Using charAt() to manually create a substring
        StringBuilder charAtSubstring = new StringBuilder();
        for (int i = startIndex; i < lastIndex; i++) {  // Create substring from index 7 to 11 (inclusive)
            charAtSubstring.append(text.charAt(i));
        }
        
        // Using the built-in substring() method
        String substringMethod = text.substring(startIndex, lastIndex);  // Substring from index 7 to 11 (inclusive)
        
        // Display both substrings
        System.out.println("Substring using charAt(): " + charAtSubstring.toString());
        System.out.println("Substring using substring(): " + substringMethod);
        
        // Compare the substrings and display the result
        if (charAtSubstring.toString().equals(substringMethod)) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("The substrings are different.");
        }
    }
}
