import java.util.*;
import java.math.MathContext;
import java.math.BigDecimal;  // * means acces everything in math directory
public class bigdecimal {
    float a=0.1f;
    float b=0.2f;
    void fun(){
        System.out.println(a+b);  //output should be 0.3 2.3 4.3 but it shows some unexpexted op so to avoid this use big decimal
        a++;
        b++;
    }

    public static void main(String[] args) {

        bigdecimal ab=new bigdecimal(); //class name obj= new constructor
        ab.fun();
        ab.fun();
        ab.fun();
        BigDecimal a=new BigDecimal("1564554567891649.646567845");  //it first convert string into bigdecimal then add it 
        BigDecimal b=new BigDecimal(566666);
        BigDecimal result1=a.add(b);
        BigDecimal result2=a.subtract(b);
        BigDecimal result3=a.multiply(b);
        // BigDecimal result4=a.divide(b);  how to perform divide in big decimal
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        // System.out.println(result4);
        //precision used to set total no of digits in bigdecimal
        //can  use mathcontext object only in bigdecimal type
        MathContext c=new MathContext(6); //6 means total number in output is 6
        BigDecimal d=new BigDecimal("1549.684");  //it first convert string into bigdecimal then add it 
        BigDecimal e=new BigDecimal(56);
        BigDecimal result5=d.add(e,c);
        System.out.println(result5);
        // BigDecimal vv=d.setScale(1,BigDecimal.ROUND_UP); //for using setscale use rounding function
        // System.out.println(vv);
        //this is not in java now so error
        
    }
    
}
