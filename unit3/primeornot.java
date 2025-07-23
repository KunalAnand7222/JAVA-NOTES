import java.util.*;
// import java.util.math;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number you want to check: ");
        int num=sc.nextInt(),count=0;
        // for(int i=2;i<num;i++){
        //     if(num%i==0){
        //         // System.out.println("Number is not a prime");
        //         count++;
        //         break;
        //     }else{
        //         continue;
        //     }
        // }
        // if(count==0&&num>=2){
        //     System.out.println("Number is a prime");
        // }else{
        //     System.out.println("Number is not a prime");
        // }
        // //second method using boolean
        // boolean isprime=true;
        // for(int i=2;i<num;i++){
        //     if(num%i==0){
        //         isprime=false;
        //         break;
        //     }
        // }
        // if(isprime&&num>=2){
        //     System.out.println("Number is a prime");
        // }else{
        //     System.out.println("number is not a prime");
        // }
        double sqr=Math.sqrt(num);
        //third method 
//notes: always store squareroot in double data type
// only check upto square root of that num for prime or not to save time complexity
        for(int i=2;i<sqr;i++){
            if(num%i==0){
                System.out.println("Not prime");
                count++;
                break;
            }
        }
        if(count==0&&num>=2){
                System.out.println("Number is a prime");
            }else{
                System.out.println("Number is not a prime");
            }

    }
}
