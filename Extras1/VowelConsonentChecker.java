import java.util.*;
public class VowelConsonentChecker{
   public static void main(String [] args){
   
   //sc object to read input
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter String:");
   String word=sc.nextLine();
   
   int vowelC=0;
   int consonantC=0;
   for(int i=0;i < word.length();i++){
   char ch=word.charAt(i);
   
   //vowels=a,e,i,o,u
  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    vowelC++;    //increment vowel value
	
  else
  consonantC++;  //increment consonant value
   }
   
   //display result
  System.out.println("vowels count:"+vowelC);
  System.out.println("consonant count:"+consonantC);
 }
} 
  
   
   