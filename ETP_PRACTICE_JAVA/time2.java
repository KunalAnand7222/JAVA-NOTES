import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class time2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        DateTimeFormatter d1= DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime l1= LocalTime.parse(a,d1);
        LocalTime l2= LocalTime.parse(b,d1);
        System.out.println(l1.plusMinutes(1));
        System.out.println(l1.plusHours(10));
        System.out.println(l1.getHour());
        System.out.println(l1.getMinute());
        Duration p1=Duration.between(l1, l2);
        System.out.println(p1.getSeconds());
        // System.out.println(l1.toEpochSecond(null, null));
        System.out.println(l1);
        System.out.println(l1.toSecondOfDay());
    }
    
}
