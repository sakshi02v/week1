import java.util.Scanner;

public class PurchasePrice {

    public static void main(String[] args) {
	int unitPrice,quantity;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Unit Price of Item:");
	unitPrice=sc.nextInt();
	System.out.println("enter quantity :");
	quantity=sc.nextInt();
	
	int total=unitPrice*quantity;
	System.out.println("The total purchase price is INR "+total+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
	}
}