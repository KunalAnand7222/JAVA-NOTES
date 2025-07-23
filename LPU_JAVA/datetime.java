import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.DayOfWeek;



public class datetime {
    public static void main(String[] args) {
        String a="20-10-2004";
        String b="10-01-2024";
        DateTimeFormatter d1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate l1=LocalDate.parse(a,d1);
        LocalDate l2=LocalDate.parse(b,d1);
        while(l2.isAfter(l1)){
            StringBuilder s1=new StringBuilder(l1.toString().replace("-",""));
            String ki=s1.reverse().toString();
            if(l1.toString().replace("-","")==ki){
                count++;
            }
        }

    }
    
}
