import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num=sc.nextInt();
        char ch=(char)('A'-1);
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                 ch=(char)(ch+1);
                System.out.print(ch+" ");
                
            }
            System.out.println();
        }
        // System.out.println((char)('A'+15));
        
    }
    
}
