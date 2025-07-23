public class multilevel {
    public static void main(String[] args) {
        // single base class multiple derived 
// base---deribed---derived---derived
home h1=new home();
house h2=new house();
kuni k1=new kuni();
h2.go();
// h1.goa(); we can access parent class with help of derived class but vice versa not true
h2.address=987; //cant assign value to parent class
System.out.println(h1.address); //0
k1.go(); //can access parent class with multi level derived class

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
class kuni extends house{
    void kunu(){
        System.out.println("kiiii.......");
    }
}