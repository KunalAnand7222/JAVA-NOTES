public class superrr {
    public static void main(String[] args) {
         a a1=new a();
         a1.fun();
    }
    
}
class a{
    void fun(){
        super.toString();//every class in java inherited from somewhere so no error in this line
        System.out.println("Parent class....");
    }

}
class b extends a{
    void fun(){
        super.fun(); //used to refer immediate parent class
        // this is used to refer current class
    }
}
