import java.util.*;
public class maxof2noifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int a=56,b=98;
        if(a>=b){
            System.out.println("A is greater than or equal to b: " + a);
        }else{
            System.out.println("a is lesser than b: " + b);
        }
        if(a%2==0){
            System.out.println("A is even number");
        }else{
            System.out.println("a is odd number");
        }
    }
    
}
