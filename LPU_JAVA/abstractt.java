public class abstractt {
    public static void main(String[] args) {
        // abstract fields can have various access modifier
        // only declaration not definition
        // no object can be created of abstract class
        // define later in base classs
        // if we want to make a abstract method then it must be in abstract class else error
        // we have to must define abstract method inside base class
        System.out.println(Math.max(060,50));
        b b1=new b();
        b1.kunu(9,8,12);

    }
    
}
abstract class a{
    // cant declare a variable of abstract
    //  abstract int a; abstract can only be class and method
    abstract void kunu(int a,int b,int c);
}
class b extends a{
    void kunu(int a,int b,int c){
        int d=a>=b?((a>c)?a:c):(b>c)?b:c;
        System.out.println(d);
        
    }
}
// class describes the attribute and behavior of an object whereas interface contains behaviors that a class implements
