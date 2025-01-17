import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class  TimeZone{
    public static void main(String[] args) {
        ZonedDateTime gmt,ist,pst;
        gmt=ZonedDateTime.now(ZoneId.of("GMT"));
        ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        pst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
   
        System.out.println("Current Greenwich Mean Time:"+gmt.format(formatter));
        System.out.println("Current Indian Standard Time:"+ist.format(formatter));
        System.out.println("Current Pacific Standard Time"+pst.format(formatter));
    }
}