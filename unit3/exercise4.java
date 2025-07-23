import java.util.*;
public class exercise4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        for(int i=0;;i++){
            num=sc.nextInt();
            if(num%10==0){
                System.out.println(num+" Number is divisible by 10 so exit the loop.");
                break;
            }else{
                System.out.println(num+" number is not multiple of 10.");
            }
        }
        while(true){
            num=sc.nextInt();
            if(num%10==0){
                System.out.println(num+" Number is divisible by 10 so exit the loop.");
                break;
            }else{
                System.out.println(num+" number is not multiple of 10.");
            }
        }
        
    }
    
}
