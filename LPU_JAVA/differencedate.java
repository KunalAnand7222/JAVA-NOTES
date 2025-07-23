import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class differencedate {
    public static void main(String[] args) {
        LocalDate l1=LocalDate.now();
        LocalDate l2=LocalDate.of(2004,10,20);
        Period p1=Period.between(l2,l1);//l1-l2
        System.out.println(p1);
        System.out.println(p1.getYears()+" "+p1.getMonths()+" "+p1.getDays());
        LocalTime l3=LocalTime.now();
        LocalTime l4=LocalTime.of(10,10,10);
        // Period p2=Period.between(l3, l4);
        Duration d1=Duration.between(l3, l4);
        System.out.println(d1);
        System.out.println(d1.getSeconds());


    }
    
}
