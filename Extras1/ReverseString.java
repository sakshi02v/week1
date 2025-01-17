import java.util.*;
public class ReverseString{
   public static void main(String [] args){
   
   //sc object to read input
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter String:");
   String word=sc.nextLine();
   
   String reverse="";
   
   for (int i= word.length()-1;i >= 0;i--){
   reverse+=word.charAt(i);
   }
   System.out.println("Reversed string is:"+reverse);
  }
}  
   