public class throwss {
    public static void main(String[] args) {
        a a1=new a();
        try{
        a1.kun();
        }
        catch(ArithmeticException b){
            System.out.println(b);
        }finally{
            System.out.println("Finally block");
        }
    }
    
}
class a{
    void kun() throws ArithmeticException{
        System.out.println("Hello ");
        throw new ArithmeticException("kiiiii");
        // int c=10/0;
        // System.out.println(c);
    }
}
// finally block execute ay any codt if we return some value from try even finally block execute

