import java.util.*;
public class SpringSeason {

    // Method to check if the date falls within the Spring season (March 20 to June 20)
    public static boolean SpringSeasonCheck (int month, int day) {
	
        if (month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
			System.out.println("Enter month:");
			int month=sc.nextInt();
			System.out.println("Enter day:");
			int day=sc.nextInt();
       
            if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31)) {
               
                if (SpringSeasonCheck(month, day)) {
                    System.out.println("It's a Spring Season");
                } 
				else {
                    System.out.println("Not a Spring Season");
                }
            }
    }
    
}
