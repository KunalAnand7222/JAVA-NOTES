import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter balance: ");
        int balance=sc.nextInt();
        try{
            if(balance==0){
                throw new ArithmeticException("You are poor");
            }else{
                System.out.println("You are very rich");
            }
        }
        catch(ArithmeticException b){
            System.out.println(b);
        }
    }
    
}
