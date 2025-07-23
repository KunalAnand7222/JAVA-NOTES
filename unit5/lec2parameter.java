import java.util.*;  //can make infinite number of function in a class
public class lec2parameter {
    public static void main(String[] args) {
        //returntype name(type arg1,type arg2){  //can pass infinite number of parametr
            // return statement;
        // }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int Sum=sum(n,m); //at time of calling no need to give type a and type b 
        System.out.println("Sum of n and m is: "+Sum);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    
}
