import java.util.ArrayList;
import java.util.List;
// we cant create method inside method
public class wildcard_Lower {
    public static void main(String[] args) {
        ArrayList<a> a1=new ArrayList<>();
        a1.add(new a());
        a1.add(new a());
        ArrayList<b> b1=new ArrayList<>();
        b1.add(new b());
        b1.add(new b());
        ArrayList<c> c1=new ArrayList<>();
        c1.add(new c());
        c1.add(new c());
        ArrayList<d> d1=new ArrayList<>();//creating a arraylist of type d 
        d1.add(new d());//adding into arraylist
        d1.add(new d());
        feed(c1);
        feed(a1);
        ArrayList<e> e1=new ArrayList<>();//creating a arraylist of type d 
        e1.add(new e());//adding into arraylist
        e1.add(new e());
        feed(e1);
        // feed(b1); cant work with lower 
        // feed(d1); cant because a is not the superclass of d 
    }
    public static void feed(List<? super e> obj){
        for(Object i:obj){
            ( (a) i ).run();
        }
    }
    
}
class a{
 void run(){
    System.out.println("a is running");
 }
}
class b extends a{
    void run(){
        System.out.println("b is running");
     }
}
class c extends a{
    void run(){
        System.out.println("c is running");
     }
}
class e extends c{
    void run(){
        System.out.println("E is running");
    }
}
class d{
    void run(){
        System.out.println("d is running");
     }
}
