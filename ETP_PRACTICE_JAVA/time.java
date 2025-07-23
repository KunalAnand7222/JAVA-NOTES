// import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        DateTimeFormatter d1= DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime l1= LocalTime.parse(a,d1);
        LocalTime l2= LocalTime.parse(b,d1);
    }
    
}
