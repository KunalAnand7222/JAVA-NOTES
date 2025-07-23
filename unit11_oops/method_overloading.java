public class method_overloading {
    public static void main(String[] args) {
        // multiple fun with same name but diff para
        // compiletime polymorphism
        cal c1=new cal();
        c1.sum(1,5);
        c1.sum(1.4f,5.6f);

    }
    
}
class cal{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(float a,float b){
        System.out.println(a+b);
    }
    // int sum(int a,int b){  duplicate

    // }
}
