public class over1 {
    public static void main(String[] args) {
        sbi b1=new sbi();
        b1.rate();
        icici a1=new icici();
        a1.rate();
    }
    
}
class bank{
    float a;
   void rate(){
    a=5;
    System.out.println(a);

   }
}
class sbi extends bank{
    void rate(){
        a=6;
        System.out.println(a);
    }

}
class icici extends bank{
   void rate(){
    a=7;
    System.out.println(a);
   }
}
