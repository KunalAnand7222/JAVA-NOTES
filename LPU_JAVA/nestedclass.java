public class nestedclass {
    public static void main(String[] args) {
        a a1=new a();
        a1.kun();
        a.b b1=a1.new b();
        b1.kun1();
        // a1.kun1();
        a.c c1=new a.c();
        // a.c c2=a1.new c();
        c1.kun();

        
        
    }
    
}
class a{
    int c=56;
    void kun(){
        System.out.println("parent class fun");

    }
    class b{
        void kun1(){
            System.out.println("Nested class function");

        }
    }
    static class c{
        void kun(){
            System.out.println("Static nested class");
        }
    }
}
// a$b$c.class bytecode created inside for nested class
// we can directly access nested class method using parent class object because inside parent class nested class hold a separate memory 