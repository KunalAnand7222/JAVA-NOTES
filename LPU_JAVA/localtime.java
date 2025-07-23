
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class localtime {
    public static void main(String[] args) {
       LocalTime l1=LocalTime.now();
        System.out.println(l1);
        LocalTime l2=LocalTime.of(20,12,31,102);
        // u have to pass value in range like dont pass 15 as month it will throw error
        System.out.println(l2);
        LocalTime l3=LocalTime.of(23,10);
        // month name all in capital
        System.out.println(l3);
        LocalTime l4=LocalTime.parse("10:20:30");
        // in local time use ":"  not hyphen
        System.out.println(l4);
        LocalTime l5=LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(l5);
        int h=l5.getHour();
        int m=l5.getMinute();
        int s=l5.getSecond();
        int n=l5.getNano();
        System.out.println(h+" "+m+" "+s+" "+n);
        boolean l6=l4.isAfter(l5);//compare both timing 
        boolean l7=l4.isBefore(l5);
        System.out.println(l6+" "+l7);
        LocalTime c1=l5.withHour(12);
        LocalTime c2=c1.withMinute(10);
        LocalTime c3=c2.withSecond(10);
        LocalTime c4=c3.withNano(100);
        System.out.println(c4);
        // LocalTime l=LocalTime.of(10,100,30);
        // System.out.println(l); 
        // cant pass morethamn 60 value
       
      
       

        






    }
    
}
