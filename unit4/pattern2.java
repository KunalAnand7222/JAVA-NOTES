import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter no. of rows: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            // for(int j=num;j>=i;j--){
            for(int j=1;j<=num-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
