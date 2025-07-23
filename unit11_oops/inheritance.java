public class inheritance {
    // we cant use directly interface variable we have to use like interfacename dot variable
    public static void main(String[] args) {
        // properties of one classpassed to derived class
        // base class or parent class
        // derived claass or child class
        home h1=new home();
        house h2=new house();
        h2.go();
        // h1.goa(); we can access parent class with help of derived class but vice versa not true
        h2.address=987; //cant assign value to parent class
        System.out.println(h1.address); //0
       
    }
    
}
class home{
    int address;
    String location;
    void go(){
        System.out.println("go to home........");
    }


}
class house extends home{  //class derive base
    int number;
    void goa(){
        System.out.println("go goa gone...");
    }
    
}
// Inheritance allows a derived class to inherit properties and methods from its base class, but instances of these classes maintain their own separate data. Therefore, changes made to properties of one instance do not affect the properties of another instance, even if one is a base class and the other is derived from it.
