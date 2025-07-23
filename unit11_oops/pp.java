import java.util.*;
public class pp {
    // both will contain n number of methods
    // byte code of interface appears .class file
 public static void main(String[] args) {
     
     e e1=new e();
     e1.get1();
     e1.get2();
     e1.get3();
     e1.display();
 }   
}
interface rate{
    void get1();
}
interface amount{
  void get2();
}
interface time{
   void get3();
}
class d implements rate,amount,time{
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    public void get1(){
        a=sc.nextInt();
    }
    public void get2(){
        b=sc.nextInt();
    }
    public void get3(){
        c=sc.nextInt();
    }
}
class e extends d{
    void display(){
        System.out.println((a*b*c)/100);
    
    }

}

