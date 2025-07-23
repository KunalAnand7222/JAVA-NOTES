import java.util.*;

public class sumofdigit {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int sum=sumofdigit(num);
        System.out.println(sum);
    }
    public static int sumofdigit(int a) {
        int sum=0;
        for(int i=0;a>0;i++){
            sum+=(a%10);
            a/=10;
        }
        return sum;
        
    }
    
}
