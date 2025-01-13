import java.util.*;
public class HeightConversion{
    public static void main(String [] args){
	
	double heightCms;
	System.out.println("Enter height in cms:"); //prompt user to enter details
	Scanner input=new Scanner(System.in);      
	heightCms=input.nextDouble();               //taking input from user
	
	double inch_cms=2.54;  //1 inch =2.54 cm
	double feet_cms=30.48; //1 feet=30.48 cm
	
	double height_inches=heightCms/inch_cms;
	
	int feet=(int)height_inches/12;
	int inches=(int)height_inches%12;
	
	//display the result
	System.out.println("Your Height in cm is "+heightCms+" while in feet is and inches is "+feet+" feet "+inches+" inches");
	}
}

	
	
	