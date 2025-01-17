import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate input=LocalDate.of(2025,01,17);
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(input.format(formatter1));
        System.out.println(input.format(formatter2));
        System.out.println(input.format(formatter3));
        
    }
  
}
