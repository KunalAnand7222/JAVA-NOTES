public class lec11 {
    public static void main(String[] args) {
        // recursion meanse calling function itself
        // first it will do top down till base condition then bottom up
        // never miss base condition
        // f(5)=5*f(4)  f(4)=4*f(3)  till 1
        dec(15);
    }
    
}
public static void dec(int n){
    if(n==1){
        System.out.println(1);
        return;
    }
    System.out.print(n+" ");
    dec(n-1);
}
