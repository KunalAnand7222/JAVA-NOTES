import java.util.*;

public class pattern14butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num=sc.nextInt();
        for(int i=1;i<=(num/2);i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(num-2*i);j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        if(num%2!=0){
            for(int i=1;i<=num;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=(num/2);i++){
            for(int j=1;j<=(num/2)-i+1;j++){
                System.out.print("*");
            }
            if(num%2!=0){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(i-1));j++){
                System.out.print(" ");

            }
            for(int j=1;j<=(num/2)-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
