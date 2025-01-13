import java.util.*;
public class AreaOfTriangle{
    public static void main(String [] args){
		
	   double base, height;
	   //Scanner class to take input base,height from user
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter base in cms:");
	   base=sc.nextDouble();
	   
	   System.out.println("Enter height in cms:");
	   height=sc.nextDouble();
	   
	   //calculating area of triangle using formula 1/2*base*height
	   double areaCms= (double)1/2*(base*height);
	   
	   //converting area of triangle in inches
	   double areaInches=areaCms/2.54;
	   
	   //display the result
	   System.out.println("Area of triangle in cms:"+areaCms);
	   System.out.println("Area of triangle in inches:"+areaInches);
	
	}
}	   
	