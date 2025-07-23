import java.util.*;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num=sc.nextInt(),count=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
             System.out.print(count+" ");
             count++;
            }System.out.println();
        }
    }
    
}
