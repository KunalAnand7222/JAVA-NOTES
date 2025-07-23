import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
// import java.util.*;
public class date_time {
    public static void main(String[] args) {
        LocalDate l1=LocalDate.now();
        System.out.println(l1);
        LocalDate l2=LocalDate.of(2004,12,31);
        // u have to pass value in range like dont pass 15 as month it will throw error
        System.out.println(l2);
        LocalDate l3=LocalDate.of(2004,Month.AUGUST,30);
        // month name all in capital
        System.out.println(l3);
        // Scanner sc=new Scanner(System.in);
        LocalDate l4=LocalDate.now(ZoneId.of("US/Eastern"));
        System.out.println(l4);
        LocalDate l5=LocalDate.parse("0199-12-30");
        // year must be of 4 
        // use hyphen between date 
        System.out.println(l5);
        int year=l2.getYear();
        int month=l2.getMonthValue();
        Month m1=l2.getMonth();//return like january february month name
        System.out.println(m1);
        int day=l2.getDayOfMonth();
        int day2=l2.getDayOfYear();//count total number of days
        boolean leap=l2.isLeapYear();
        DayOfWeek d1=l2.getDayOfWeek();
        System.out.println(year+" "+month+" "+m1+" "+day+" "+day2+" "+leap+" "+d1);
        // boolean check=year.isLeapYear(); this is only work with object of localdate 
        LocalDate l6=l2.withYear(2006);
        LocalDate l7=l6.withMonth(5);//set month
        LocalDate l8=l7.withDayOfMonth(26);//set day of month 
        LocalDate l9=l8.withDayOfYear(360);
        // calculate and return according to day 
        System.out.println(l8);
        System.out.println(l7);
        System.out.println(l6);
        System.out.println(l9);
        LocalDate k1=l9.plusYears(15);
        LocalDate k2=k1.plusMonths(5);
        LocalDate k3=k2.plusWeeks(4);
        LocalDate k4=k3.plusDays(30);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);
        System.out.println(k4);
        LocalDate k9=k4.plusDays(-10);
        System.out.println(k9);

        LocalDate k5=l9.minusYears(15);
        LocalDate k6=k1.minusMonths(5);
        LocalDate k7=k2.minusWeeks(4);
        LocalDate k8=k3.minusDays(30);
        LocalDate p1=LocalDate.of(1999,12,30);
        LocalDate p2=p1.plusDays(4000);
        DayOfWeek p4=p2.getDayOfWeek();
        System.out.println(p4);

        







    }
    
}
// date and time class is of lang package
// java follow iso standrd iso 8601 (yyyy,mm,dd)
// localdate is immutabkle date time object 
// 
