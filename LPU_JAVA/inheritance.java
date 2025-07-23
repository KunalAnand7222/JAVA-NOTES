public class inheritance {
    public static void main(String[] args) {
        // we can access base class by using base class object but cant access base class by object of parent class   //
        // super and sub class  
        // if want to change in parent class variable use static keyword
        a a1=new b();
        // b b2=new a(); we cant refer parent class to base class
        c c1=new c();
        b b1=new b();
        c1.kun();
        b1.kun();
    }
    
}
class a{
    void kun(){
        System.out.println("kunu");
    }

}
class b extends a{
     void kunu(){
        System.out.println("kuni");
     }
}
class c extends b{

}
class d extends a{

}
class e extends b{

}
