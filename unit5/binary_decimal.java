import java.util.*;
public class binary_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entyer binary form: ");
        int num=sc.nextInt();
        String a="1011";
        System.out.println(Integer.parseInt(a,2));
        int decimalform=bin_to_decimal(num);
        System.out.println(decimalform);
        System.out.println();


    }
    public static int bin_to_decimal(int num) {
        int sum=0;
        for(int i=0;num>0;i++){
            int pow=num%10;  //last digit
            // if(pow!=0){
            // sum+=Math.pow(2,(pow*i));
            // }
            //dec=dec+lastdigit*pow(2,i);
            sum=sum+(int)(pow*Math.pow(2,i));
            num/=10;

        }
        return sum;
    }
    
}
