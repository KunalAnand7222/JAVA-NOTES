import java.util.*;
public class primein_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower value: ");
        int low=sc.nextInt();
        System.out.print("Enter higher value: ");
        int high=sc.nextInt();
        range(low,high);

    }
    public static void range(int a,int b){
        if(a<2){
            a=2;
        }
        System.out.print("Prime in given range is: ");
        for(int i=a;i<=b;i++){
            boolean check=true;
            for(int j=2;j<=Math.sqrt(i);j++){ //always use math.sqrt 
                //instead of this we can also make a function to check prime then use this to print 
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check){
                System.out.print(i+" ");
            }

        }
    }
    
}
