public class abstractt {
    public static void main(String[] args) {
        // similar as encapsulation but in abtraction we are hiding as well as showing necessary thing 
        // we are giving idea but not implementation of this
        // cant create instance of abstract class
        // can have abstract and non abstract method
        // can have constructors
        // human h1=new human(); cant create object of abs class
        men m1=new men();
        // m1.talk();
        women w1=new women();
        System.out.println(w1.a);//it will only give what inside parent class
        // w1.talk();
        // human h1=new men();//can create object also like this
        // h1.talk();
        // h1.walk();

    }
    
}
abstract class human{
    int a;
    human(){
        a=5;
        System.out.println(a);
    }
    void walk(){
        System.out.println("Walking");
    }
    abstract void talk();//abstract means no implementation
    // every extended class must contain abstract method with same return type 
}
class men extends human{
    men(){
        a=7; //we cant chjange parent variable value with base class
        System.out.println(a);
    }
    void talk(){
        System.out.println("talk less");
    }
}
class women extends human{
    women(){
        System.out.println("white");
    }
    void talk(){
        System.out.println("talk more more.........");
    }
}
// constructor will be called parent---base---base
// parent---parent--base