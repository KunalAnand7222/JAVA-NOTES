import java.util.*;
public class addbinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        int temp=0;
        int arr[]=new int[10],f=0;
        // long max=Math.max(a,b);
        while(a!=0){
            if(a%10==1&&b%10==1&&temp==0){
                arr[f++]=0;
                temp=1;
            }else if(a%10==1&&b%10==1&&temp==1){
                arr[f++]=1;
                temp=0;
            }else if((a%10==0&&b%10==1)||(a%10==1&&b%10==0)&&temp==0){
                arr[f++]=1;
                temp=0;
            }else if((a%10==0&&b%10==1)||(a%10==1&&b%10==0)&&temp==1){
                arr[f++]=0;
                temp=1;
            }
            a/=10;
            b/=10;
            

        }
        for(int i=f-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        

    }
    
}
