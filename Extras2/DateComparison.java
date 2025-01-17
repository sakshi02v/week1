import java.time.LocalDate;
public class DateComparison {
    public static void main(String[] args) {
        LocalDate date1=  LocalDate.of(2025,01, 17);
        LocalDate date2=  LocalDate.of(2025,01, 17);
        if(date1.isBefore(date2)){
            System.out.println("Date 1 is before Date 2");
        }
        
        else if(date1.isAfter(date2)){
            System.out.println("Date 1 is after Date 2");  
        }
        else if(date1.isEqual(date2)){
            System.out.println("Date 1 is equal to Date 2"); 

        }
        
    }
    
}
