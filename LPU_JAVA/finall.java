public class finall {
    public static void main(String[] args) {
        System.out.println("kunioi");
        b b1=new b();
        b1.kun();
    }
    
}
interface a{
    int b=56; //we can give its value by using constructor 
    void kun();
//   a(){
//     b=96;
//   }
//    void kun(){
//     b=56;
//    }
}
interface c{
    int b=96;
}
class b implements a{
    public void kun(){
    System.out.println(c.b);//if there ar emultiple interface then use interfacename dot variable to indicate whivh var u want to get op
    }
}
