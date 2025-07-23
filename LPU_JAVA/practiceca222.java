import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class practiceca222 {
    public static void main(String[] args) {
        String a="15:10:12";
        String b="18:12:25";
        DateTimeFormatter d1=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime l1=LocalTime.parse(a,d1);
        LocalTime l2=LocalTime.parse(b,d1);
        int x=l1.getHour();
        int y=l2.getHour();
        int z=(y-x)*60+l1.getMinute()+l2.getMinute();
        System.out.println(z/60);

        // System.out.println(l1);
        System.out.println(l1.getHour());
        System.out.println(l1.getMinute());
        System.out.println(l1.getSecond());
        Duration d2=Duration.between(l1,l2);
        System.out.println(d2);
        System.out.println(d2.getSeconds());
        System.out.println(d2.toHours());
        System.out.println(d2.toMinutes());
        System.out.println(d2.toSeconds());
    }
    
}
