public class lambdaaa {
    public static void main(String[] args) {
        kuni k1=(a)-> fib(a);
        System.out.println(k1.fib(6));
    }
    public static int fib(int n){
        int a=1;
        for(int i=0;i<=n;i++){
            a*=i;
        }
        return a;
    }
    
}
interface kuni{
    int fib(int a);
}
