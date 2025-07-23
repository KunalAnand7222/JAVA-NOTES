public class anonymousoverirde {
    public static void main(String[] args) {
        a a1=new a(){
            void kun(){
                System.out.println("Anonymous class");
            }

        };
        a1.kun();
        b b1=new b(){
            void kun(){
                System.out.println("Anonymous class");
            }

        };
        b
    }
    
}
class a{
    void kun(){
        System.out.println("Class function");
    }
}
abstract class b{
    void kun(){
        System.out.println("B fun");
    }
}
