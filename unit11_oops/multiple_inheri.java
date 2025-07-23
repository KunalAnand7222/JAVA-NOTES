public class multiple_inheri {
    public static void main(String[] args) {
        animal a1=new animal();
        a1.kill();
        a1.eat();
    }
}
interface herbivore{
    void eat(); //not necessary that every interface contain same method name
    int a=56;
}
interface carnivore{
   void kill();
   int a=98;
   void eat(); //can declare same method name of other interface 
}
class animal implements herbivore,carnivore{
    public void eat(){
        System.out.println("eat grass");
    }
    public void kill(){
        System.out.println("killl more animal");
    }
    
}
