import java.util.*;
public class exercisefn1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        double avg=average(first,second,third);
        System.out.println(avg);
        System.out.println(iseven(first));
    }public static double average(int a,int b,int c){ //we have to always use static else throw error
        return ((double)(a)+b+c)/3;
    }
    public static boolean iseven(int first){
        if(first%2==0){
            return true;
        }else{
            return false;
        }
    }
    
}
