import java.util.Scanner;

public class constructorrr {
    constructorrr(int a){
        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        constructorrr kun=new constructorrr(a);
    }
    
}
