public class interfacee {
    public static void main(String[] args) {
        // Math.max(060,050); 48 bcz it is octal it firts convert to decimal then compare
        // by default variable is of final and method is of abstract type 
        // final method cant be overide
        // final class cant be extend
        // final variable cant be change
        static int a;
        

    }
    
}
interface a{
    void fun();
}
interface b{
   void fun();
}
class c implements a,b{
  public void fun(){
    System.out.println("kuni");
  }
}
