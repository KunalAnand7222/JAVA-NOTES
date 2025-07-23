import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number you want to check: ");
        int num=sc.nextInt();
        System.out.println("Number is prime: "+is_check(num));

    }
    public static boolean is_check(int a){
        if(a<2){
            return false;
        }
        boolean check=true;
        for(int i=2;i<a;i++){
            if(a%i==0){  //mistake not(i%a==0) it will never go inside if block
                // check=false;
                return false;

                // break;

            }
        }
        return check;
    }
}
