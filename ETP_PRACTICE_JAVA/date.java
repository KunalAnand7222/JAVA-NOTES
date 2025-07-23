// import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.*;
import java.time.*;

public class date {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        DateTimeFormatter d1= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate l1= LocalDate.parse(a,d1);
        LocalDate l2= LocalDate.parse(b,d1);
        System.out.println(l1.plusDays(1));
        System.out.println(l1.plusMonths(1));
        System.out.println(l1.plusYears(2));
        System.out.println(l1.toEpochDay());
        DayOfWeek d2=l1.getDayOfWeek();
        System.out.println(d2);
        System.out.println(l1);
        System.out.println(l1.getDayOfMonth());
        // System.out.println(l1.getDayOfYear());
        System.out.println(l1.getMonthValue());
        System.out.println(l1.getMonth());
        System.out.println(l1.getYear());
        Period p1=Period.between(l1, l2);
        System.out.println(p1.getYears());
        System.out.println(p1.getMonths());
        System.out.println(p1.getDays());
        System.out.println(l1+" "+l2);
        while(!l1.isAfter(l2)){
            String aa=l1.toString();
            String bb=aa.replaceAll("-","");
            // System.out.println(bb);
            StringBuffer s1=new StringBuffer(bb);
            String c=s1.reverse().toString();
            if(bb.equals(c)){
                System.out.println(aa);
            }
            l1=l1.plusDays(1);
        }
    }
    
}
