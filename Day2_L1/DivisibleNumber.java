import java.util.*;
public class DivisibleNumber{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int number=sc.nextInt();
	if(number%5 == 0)
	System.out.println("Is the number divisible by 5?"+" \nYes");
	else 
	System.out.println("Is the number divisible by 5?"+" \nNo");
	}
}	