import java.util.*;
//we do not need to check prime upto n-1 just check upto squareroot of that number because after sqrt every factor repeat
// Ex: 16=1*16 2*8 4*4 8*2 16*1

public class primeoptimised {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        System.out.println("Number is prime: "+check(num));

    }
    public static boolean check(int a){
        if(a<2){
            return false; //return work as break like break for exiting the loop and return is for exiting the function.
        }
        // boolean is_prime=true;
        for(int i=2;i<=Math.sqrt(a);i++){ //mistake i<= equal to sign must
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    
}
