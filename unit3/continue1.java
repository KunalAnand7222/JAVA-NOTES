import java.util.*;
public class continue1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            int num=sc.nextInt();
            if(num%10==0){
                continue;
            }else{
                System.out.print(num+" ");
            }
        }

    }
    
}
