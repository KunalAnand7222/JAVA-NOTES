import java.util.Scanner;

public class upto_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;;i++){
            boolean flag=true;
            try{
                int a=sc.nextInt();
            }catch(ArithmeticException h){
                flag=true;
            }
            if(flag){
                break;
            }
        }
    }
    
}
