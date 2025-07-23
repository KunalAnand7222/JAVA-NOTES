import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class practice {
    public static void main(String args[]){
        LocalDate l1=LocalDate.of(2007,Month.JANUARY,3);
        LocalDate l2=l1.withDayOfYear(90);
        System.out.println(l2);
        DayOfWeek d1=l2.getDayOfWeek();
        System.out.println(d1);
        LocalDate l3=l1.withMonth(12);
        System.out.println(l3);
        LocalTime l4=LocalTime.of(14,30,0);
        LocalTime l5=l4.plusHours(2);
        LocalTime l6=l5.plusMinutes(15);
        LocalTime l7=l6.plusSeconds(30);
        LocalTime l8=l7.plusNanos(1);
        System.out.println(l8);
    }
    
}
