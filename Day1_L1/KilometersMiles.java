import java.util.*;
public class KilometersMiles{
    public static void main(String [] args){
       //creating variable km of type double
	   double km;
	   System.out.println("Enter kilometres:");
	   
	   //creating scanner class for taking km as input from the user
	   Scanner input=new Scanner(System.in);
	   km=input.nextDouble();
	   
	   //converting km to miles 
	   double mile=km*0.6;
	   System.out.println("The total miles is "+ mile+ " mile for the given " +km+ "km");
	 }
}	 

	   