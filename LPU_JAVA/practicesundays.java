import java.time.DayOfWeek;
import java.time.LocalDate;

public class practicesundays {
    public static void main(String[] args) {
        LocalDate l1=LocalDate.of(2012,10,5);
        LocalDate l2=LocalDate.of(2014,4,6);
        int count=0;
        while(!l1.isAfter(l2)){
            DayOfWeek d1=l1.getDayOfWeek();
            if(d1==DayOfWeek.SUNDAY){
                count++;
            }
            l1=l1.plusDays(1);  
        }
        System.out.println(count);
    }   
}
