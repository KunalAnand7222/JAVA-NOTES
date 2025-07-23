import java.util.*;
public class lec5_binomial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        //ncr=(n!)/(r!)*(n-r!);
        //n!
        int first=facto(n);
        //r!
        int second=facto(r);
        //n-r!
        int third=facto(n-r);
        int ncr=(first)/((second)*(third));
        System.out.println(ncr);

    }
    public static int facto (int a){
        int facti=1;
        for(int i=a;i>=0;i--){
            if(i==0){
                // return facti;   never use return statement inside loop it will throw error
                facti*=1;
                break;
            }else{
                facti*=i;
            }
        }
        return facti;
    
}
}
