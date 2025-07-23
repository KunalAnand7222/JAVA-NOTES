public class interface_default {
    // if we want implementation in interface we have to use default or static keyword before method
    public static void main(String[] args) {
        a a1=new a();
        a1.kunu();
        kuni.ki(); //can directly access with class name 
    }
    
}
interface kuni{
    default void kunu(){
        System.out.println("Interface class fun");
    }
    static void ki(){
        System.out.println("kiuuo");
    }
//   int a; cant declare cariable inside interface only methods
}
class a implements kuni{
    public void kunu(){
        kuni.super.kunu();//can override interface method like this 
        // interface name dot then as same before
        System.out.println("base class");

    }
    public void ki(){
        // kuni.super.ki(); we cant override static method
        System.out.println("base class");
    }
}
