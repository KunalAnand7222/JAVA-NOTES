public class anonymousclass {
    public static void main(String[] args) {
        fib f1=new fib(){
            int a=0,b=1;
            public void fibo(int n){
                System.out.println(a);
                for(int i=0;i<n;i++){
                    int fibi=a+b;
                    System.out.println(fibi);
                    a=b;
                    b=fibi;
                }

            }

        };
        f1.fibo(5);
            
    }
    
}
interface fib{
    void fibo(int n);
}
// single line-> create object and their body
// nested class- local and anonymous class
// interface can create variable but not object
// 
