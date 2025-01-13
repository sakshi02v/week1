import java.util.Scanner;
public class TravelComputation {
    public static void main(String[] args) {
	// Create input object to read input
	Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter name of traveller");
	 String name=sc.nextLine();
	 
	 System.out.println("Enter name of from city ");
	 String fromCity=sc.nextLine();
	 
	 System.out.println("Enter name of via City");
	 String viaCity=sc.nextLine();
	 
	 System.out.println("Enter name of to city");
	 String toCity=sc.nextLine();
	 
	 System.out.println("Enter distance from city to via city in km");
	 double distanceFromToViaCity=sc.nextDouble();
	 System.out.println("Enter time taken by from city to via city in mins");
	 int timeFromToVia=sc.nextInt();
	 
	 System.out.println("Enter distance of via city to to city in km");
	 double distanceViaToFinalCity=sc.nextDouble();
	 System.out.println("Enter time taken of via city to to city in mins");
	 int timeViaToFinal=sc.nextInt();
	 
	 double totalDistance=distanceFromToViaCity+distanceViaToFinalCity;
	 int totalTime=timeFromToVia+timeViaToFinal;
	 
	 System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " +" the Total Time taken is " + totalTime + " minutes");
	 }
}	 
	 
	 
	 
	 

	