import java.util.*;
public class LongestWord{

   public static String LongestWord(String sentence){
      String [] words=sentence.split(" ");
      String longestword="";
      for(String word:words){
    if(word.length() > longestword.length()){
    longestword = word;
       }
    }
	return longestword;
 }  
    public static void main(String [] args){
   
   //sc object to read input
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Sentence:"); //prompt user to take input
   String sentence=sc.nextLine();
   String longestword=LongestWord(sentence);
   
   System.out.println("Longest word in sentence: "+longestword);
   }
 }  
   