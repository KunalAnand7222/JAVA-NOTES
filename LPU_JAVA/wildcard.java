import java.util.ArrayList;
import java.util.List;
// we cant create method inside method
public class wildcard {
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
        feed(b1);
        // feed(d1); cant because a is not the superclass of d 
    }
    public static void feed(List<? extends a> obj){
        for(a i:obj){
            i.run();
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
        System.out.println("d is running");
     }
}
class d{
    void run(){
        System.out.println("d is running");
     }
}
