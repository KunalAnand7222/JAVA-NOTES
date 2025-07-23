import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;
public class practiceca2 {
    public static void main(String[] args) {
        String a="30/03/2004";
        String b="29/07/4008";
        DateTimeFormatter d1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter d2=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate l1=LocalDate.parse(a,d1);
        LocalDate l2=LocalDate.parse(b,d1);
        System.out.println(l2.toEpochDay());
        // System.out.println();
        // boolean k=l2.before(l1);
        String aa=l1.format(d2);
        System.out.println(aa);
        System.out.println(l1.plusDays(10));
        System.out.println(l1.plusMonths(2));
        System.out.println(l1.plusYears(3));
        System.out.println(l1.withYear(2004));
        System.out.println(l1.withMonth(2));
        System.out.println(l1.withDayOfMonth(29));
        System.out.println(l1.withDayOfYear(360));
        System.out.println(l1.getDayOfMonth());
        System.out.println(l1.getDayOfYear());
        System.out.println(l1.getYear());
        System.out.println(l1.getMonthValue());
        System.out.println(l1.getMonth());
        Period p1=Period.between(l1,l2);
        System.out.println(p1);
        System.out.println(p1.getDays());
        System.out.println(p1.getMonths());
        System.out.println(p1.getYears());
        while (!l1.isAfter(l2)) {
            StringBuilder s1 = new StringBuilder(l1.toString().replace("-",""));
            String ku = s1.reverse().toString();
            if (l1.toString().replace("-", "").equals(ku)) {
                System.out.println(l1);
            }
            l1 = l1.plusDays(1);
        }


    }
    
}
