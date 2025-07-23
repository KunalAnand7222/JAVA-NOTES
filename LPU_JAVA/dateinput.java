import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateinput {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        String a = "26-jul-2025";
        SimpleDateFormat s1 = new SimpleDateFormat("dd MMM yyyy");
        Date d1 = s1.parse(a);
        System.out.println(d1);
        System.out.println(s1.format(d1));
    }
}
