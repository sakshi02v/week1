import java.util.Scanner;

public class NumberFormatExDemo{
 
    public static void Exceptionhere(String input) {
	int number=Integer.parseInt(input);
	}
	
	public static void handleException(String input){
	try{
	Exceptionhere(input);
	}
	catch(NumberFormatException e){
	System.out.println("NumberFormatException caught");
	}
	catch(RuntimeException e){
	System.out.println("NumberFormatException caught");
	}
  }

   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String input=sc.nextLine();
   try{
   Exceptionhere(input);
   }
   catch(Exception e){
   handleException(input);
   
   }
   }
}
	
	