import java.util.Scanner;

public class overriding {
    // super keyword use to prevent overriding or can call voth parent and child function
    public static void main(String[] args) {
// parent and child class both contain same function with a different definition.
     kuni k1=new kuni();
     k1.marks();  //it will call kuni class not parent class this is known as over riding
    }
    
}
class stu{
    Scanner sc=new Scanner(System.in);
    void marks(){
        System.out.println("fail");
    }
}
class kuni extends stu{
    void marks(){
        int a=sc.nextInt();
        super.marks();  //it will first call parent class marks function then base class
        System.out.println("pass");
    }
}
