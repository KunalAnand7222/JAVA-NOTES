import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class localdatetime {
    public static void main(String[] args) {
        LocalDateTime l1=LocalDateTime.now();
        System.out.println(l1);
        LocalDateTime l2=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        LocalDateTime l3=LocalDateTime.of(2004,10,30,10,10,10);
        // add t after date 
        System.out.println(l3);
        LocalDate t1=l3.toLocalDate();
        System.out.println(t1);
        LocalTime t2=l3.toLocalTime();
        System.out.println(t2);
        LocalDateTime t3=l3.withHour(20);
        System.out.println(t3);

    }
    
}
