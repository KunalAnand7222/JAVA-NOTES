public class hierarchi {
    public static void main(String[] args) {
        // base class of multiple derived class
        // derived---base---derived
        colour c1=new colour();
        height h1=new height();
        c1.smart(); //can access parent class with the help of both derived class
        h1.smart();
        // c1.heightt(); cant access other derived class with use of other derived class

    }
    
}
class Student{
    void smart(){
        System.out.println("Smart boy.....");
    }
}
class colour extends Student{
    int colourr;
    void color(){
        System.out.println("White colour");
    }
    void smart(){
        System.out.println("smartie...");
    }
}
class height extends Student{
    void heightt(){
        System.out.println("5.6 inch.......");
    }

}
