import java.util.*;

public class pattern13_palindromic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int l=1;l<=num-i;l++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(i-j+1);
            }System.out.print(1);
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }System.out.println();

        }
    }
    
}
