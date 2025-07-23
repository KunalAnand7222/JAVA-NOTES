public class superr {
    // we cant refer interface using super
    public static void main(String[] args) {
        // super is used to refer immediate parent class
        // to access parents properties,fun or constructor
         men m1=new men();
         m1.kunu();
         human h1=new human(0);
         System.out.println(h1.colour);
        //  cant change or assign variable of parent class with super keyword even
    }
    
}
class human{
    String colour;
    human(int a){
        System.out.println("parent class constructor "+a);
    }
     void kunu(){
        System.out.println("parent class");
     }
}
class men extends human{
    men(){
        // super.colour="red";
        super(56);//used to refer to parent class cond and passing value in parent class constructor
        // by default at the time of creation of object of base class parent class cons will auto called but if we want to pass any argument then use super keyword 
        super.colour="red";
        System.out.println("base constructor");
    }
    void kunu(){
        super.kunu(); //first it call parent class kunu function
        System.out.println("base class");
    }
}
// first parent ---base --base constructor because by default jave write super() in every base constructor
