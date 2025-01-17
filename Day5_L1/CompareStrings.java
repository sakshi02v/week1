import java.util.*;
public class CompareStrings{
   public static void main(String [] args){
   
   //sc object to read input
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first String:");
   String word1=sc.next();
   System.out.println("Enter second String:");
   String word2=sc.next();
   
   boolean areEqual=true;
   if(word1.length() != word2.length()){
   areEqual=false;
   }
   else{
   for(int i=0;i<word1.length();i++){
   if(word1.charAt(i)!=word2.charAt(i)){
   areEqual=false;
   break;}
   }
   }
   System.out.println("are strings equal:"+areEqual);
   }
}   
   