public class confu{
    public static void main(String[] args) {
        kunu k1=new kunu();
        k1.a=52;
        k1.k();
        System.out.println(k1.a); //56
        kuni k2=new kuni();//becaz it will first call parent class constructor and it will assign it to 54 then after no change
        System.out.println(k2.a);//54
        // if there will be any change in parent class there will be no impact on base class
        // if we want it will impact then use super keyword for overrriden 
    }
}
class kunu{
    int a;
    kunu(){
        this.a=54;
    }
    void k(){
        a=56;
    }
}
class kuni extends kunu{

}