public class interfaces2 {
    public static void main(String[] args) {
        // pubg p1=new pubg(); cant create object
        men m1=new men();
        m1.kill();
        women w1=new women();
        w1.kill();
        // all base class method must be public if it inherited from interface

    }
}
interface pubg{
    // pubg(){  interfaces cannot hve constructors
    //     System.out.println("parent...");
    // }
    void kill();
}
class men implements pubg{
    public void kill(){
        System.out.println("Can play better!..");
    }
}
class women implements pubg{
    public void kill(){
        System.out.println("noob player....");
    }
}
// we cant use directly interface variable we have to use like interfacename dot variable
