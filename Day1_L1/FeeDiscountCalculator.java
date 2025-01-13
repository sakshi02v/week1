import java.util.*;
public class FeeDiscountCalculator{
    public static void main(String [] args){
		
		//creating variables studentFee,discountPercent
	    double studentFee, discountPercent;
		
        //Scanner class for taking input from user
		Scanner input=new Scanner(System.in);
	   
	    //Prompt user to enter details
	    System.out.println("Enter student fee:");
		studentFee=input.nextDouble();
		
		System.out.println("Enter discount percent:");
		discountPercent=input.nextDouble();
		
		//discount calculation
		double discount=(studentFee*discountPercent)/100;
		double discountedFee=studentFee-discount;
		
		//display the result
		System.out.println("discount amount is "+discount+" and discounted fee is"+discountedFee);
		}
}		
		