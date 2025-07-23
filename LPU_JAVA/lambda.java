public class lambda {
    public static void main(String[] args) {
        a k1=(o)->{
            int c=0,d=1,fib=0;
            for(int i=0;i<o;i++){
                System.out.println(fib);
                fib=c+d;
                c=d;
                d=fib;
            }
        };
        k1.kun(5);
    }
    
}
interface a{
    void kun(int b);
    static void kuni(){
        System.out.println();
    }
    default void kuno(){

    }
}
// static and default method can be created inside a interface
// lambda exp:closures
// -> lambda operator
// lambda exp can only be used in functuional interface(only one abstract method can insert object class method and static and default method)