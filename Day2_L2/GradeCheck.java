import java.util.*;
public class GradeCheck{
    public static void main(String [] args){
	    //sc object to read input from the user
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of maths:");
		double mathMarks=sc.nextDouble();
		System.out.println("Enter marks of physics:");
		double phyMarks=sc.nextDouble();
		System.out.println("Enter marks of Chemistry:");
		double chemMarks=sc.nextDouble();
		
	    double Percentage= (mathMarks+phyMarks+chemMarks)/3;
		
		if(Percentage>=80){
		System.out.println(Percentage+" Level 4");
		}
		 
		 else if(Percentage>=70 && Percentage<=79){
		 System.out.println(Percentage+" Level 3");
		 }
		 
		 else if(Percentage>=60 && Percentage<=69){
		 System.out.println(Percentage+" Level 2");
		 }
		 
		 else if(Percentage>=50 && Percentage<=59){
		 System.out.println(Percentage+" Level 1");
         }
		 
		 else if(Percentage>=40 && Percentage<=49){
		 System.out.println(Percentage+" Level 1");
         }
		 
		 else if(Percentage>=0 && Percentage<=39){
		 System.out.println(Percentage+" Remedial Standards");
         }
		 
	}
}
		 
		