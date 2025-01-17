import java.time.LocalDate;


public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate input=LocalDate.of(2025,01, 17);
        LocalDate result=input.plusDays(7).plusMonths(1).plusYears(2);
        result=result.minusWeeks(3);
        System.out.println("Final date:"+result);
    }  
}
