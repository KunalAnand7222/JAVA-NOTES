import java.util.*;
//jo remainder sbse phle aaya usko ones place pe store kro and so on 

public class decimal_binary {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal form: ");
        int num=sc.nextInt();
        decimal_to_binary(num);
    }
    public static void decimal_to_binary(int n){
        double rev=0;
        for(int i=0;n>0;i++){
            int rem=n%2;
            rev=rev+rem*Math.pow(10,i); //
            n/=2;
        }
        System.out.println((long)(rev));
    }
    

    
}
