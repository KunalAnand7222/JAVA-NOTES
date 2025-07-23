import java.util.*;
public class lec4_logical {
    public static void main(String[] args) {
        int a=0,b=1;
        // System.out.println(a&&b);  this is not valid in java 
        // java donot treat 1 as true and 0 as false 
        System.out.println((a>b)||(b>a)); // if both true then true otherwise false
        System.out.println((b>a)&&(b==1)); // or if both false then false otherwise true
        System.out.println(!(b==1));   //reverse the answer 
       
        

    }
    
}
