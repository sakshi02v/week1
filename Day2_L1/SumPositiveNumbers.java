import java.util.Scanner;

public class SumPositiveNumbers {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//total variable for getting total sum
		double total = 0.0;
		
		//variable for input
		double number;
		
		while(true){
		
			//Prompt user to input number
			System.out.println("Enter Number to add");
			number = input.nextDouble(); 
			
			//adding number to total
			total += number;
			
			if(number <= 0)
				break;
				
		}
		
		System.out.println("The total sum of numbers "+total);
		input.close();
	
	}
}