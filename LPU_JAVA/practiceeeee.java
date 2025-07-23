import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
// import java.util.*;

public class practiceeeee {
    public static void main(String[] args) {
        String a="20-12-2004";
        String b="30-12-2004";
        DateTimeFormatter d1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate l1=LocalDate.parse(a,d1);
        LocalDate l2=LocalDate.parse(b,d1);
        Period d2=Period.between(l1, l2);
        System.out.println(d2.getDays());
       
       
    }
    
}
