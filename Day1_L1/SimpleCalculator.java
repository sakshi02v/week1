import java.util.*;
public class SimpleCalculator{
    public static void main(String [] args){
		
		//prompt welcome message		
	    System.out.println("Welcome to calculator");
		
		//creating variables num1,num2 to take input of two numbers
	    double num1,num2;
		
	    Scanner input=new Scanner(System.in);
	    System.out.println("enter first number:"); //prompt user to enter first number
	    num1=input.nextDouble();
	
	    System.out.println("enter second number:");    //prompt user to enter second number
	    num2=input.nextDouble();
	
	    double add=num1+num2;
	    double sub=num1-2;
	    double div=num1/num2;
	    double mul=num1*num2;
	    System.out.println("Addition :"+add);
	    System.out.println("Subtraction:"+sub);
	    System.out.println("Multiplication:"+mul);
	    System.out.println("Division"+div);
	}
}	
	
	
	