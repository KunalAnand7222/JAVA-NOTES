import java.util.*;
public class lec11_Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextFloat();
        float bill=a+b+c;
        System.out.println((a+b+c)/3);
        System.out.println("Total bills after adding gst: "+ (bill+(bill*0.18)));
        int side=sc.nextInt();
        System.out.println("Area of square is: "+ side*side);
        //in place of comma we have to use + sign to print different data type in single syso
        int $=56;//no error
        // name of variable can start with underscore and dollar sign

        
    }
    
}
