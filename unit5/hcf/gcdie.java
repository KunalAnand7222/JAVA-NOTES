// package hcf;

import java.math.*;
import java.util.*;

public class gcdie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        BigInteger a=sc.nextBigInteger();
        System.out.print("Enter second number: ");
        BigInteger b=sc.nextBigInteger();
        System.out.println(a.gcd(b));
        // int c=Math.min(a,b);
        // int d=Math.max(a,b);
        // int rem=c;
        // int gcdu=gcdi(c,d);
        // for(int i=0;;i++){
        //     int temp=c;
        //     c=d%c;
        //     d=temp;


        // }
        // System.out.println(gcdu);
        
    }
    // public static int gcdi(int a,int b){
    //     if(a==0){
    //         return b;
    //     }
    //     if(b==0){
    //         return a;
    //     }
    //     int temp=a;
    //     a=b%a;
    //     b=temp;
    //     return gcdi(a,b);

    // }
    
}
