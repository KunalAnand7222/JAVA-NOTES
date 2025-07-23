import java.util.*;
import java.lang.String;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        //1131=0*0+1
        //1*10+3
        //13*10+1=131
        //131*10+1=1311
        //rev*10+lastdigit
        int rev=0;
        for(int i=0;;i++){
            int rem=num%10;
            rev=rev*10+rem;
            
            num/=10;
            if(num==0){
                break;
            }
        }
        System.out.println(rev);
    }
    
}
