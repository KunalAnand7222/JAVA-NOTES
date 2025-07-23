import java.util.Scanner;

public class pattern15_hollowrhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num=sc.nextInt();
        for(int i=1;i<=num-1;i++){
            System.out.print(" ");
        }
        for(int i=1;i<=num;i++){
            System.out.print("*");
        }System.out.println();
        for(int i=1;i<=num-2;i++){
            for(int k=1;k<=num-i-1;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=num-2;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=num;i++){
            System.out.print("*");
        }
    }
    
}
