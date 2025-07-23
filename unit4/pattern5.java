import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num=sc.nextInt();
        for(int i=1;i<=num+1;i++){
            System.out.print("*");
        }
        System.out.print("\n");
        for(int i=2;i<num;i++){
            System.out.print('*');
            for(int j=1;j<=num+1-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");

        }
        for(int i=1;i<=num+1;i++){
            System.out.print("*");
        }

    }
}
