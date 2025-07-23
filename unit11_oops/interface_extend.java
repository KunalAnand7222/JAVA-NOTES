public class interface_extend {
    // we have to use extends in between same thing like b/w interfdace and interface extends and if diferent then use implements
    public static void main(String[] args) {
        display d1=new display();
        d1.kun();
    }
}
interface prime{
     void kun();
}
class prim implements prime{
  public void kun(){ 
    System.out.println("kunu");
  }
}
// always call interface because we are calling from public method class 
class display extends prim implements prime{//can use implements and extends together
// class display implements prime extends prim{ //error
     public void kun(){
        super.kun();
         System.out.println("kuni");
     }
}
