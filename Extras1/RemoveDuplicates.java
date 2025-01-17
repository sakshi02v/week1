import java.util.*;
public class RemoveDuplicates{

   public static String removeDuplicates(String word){
      StringBuilder result=new StringBuilder();
	  boolean[] seen=new boolean[256]; //assuming ASCII characters
	  
	  for(int i=0;i<word.length();i++){
	  char currentChar=word.charAt(i);
	  
	  if(!seen[currentChar]){
	  result.append(currentChar);
	  seen[currentChar]=true;
	  }
	 }
	 return result.toString();
}	 
   
   
   public static void main(String [] args){
   
   //sc object to read input
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter String:");
   String word=sc.nextLine();
   
   //display result
   String result=removeDuplicates(word);
   System.out.println(result);
   }
 } 
   
   