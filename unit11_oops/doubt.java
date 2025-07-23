public class doubt {
    public static void main(String[] args) {
        kunu k1=new kunu();
        // System.out.println(kunu.a); cant directly use classname.var to access
        // can access directly use with clas name if there is static var or function
        System.out.println(kunu.a);
    }
    
}
class kunu{
    static int a;
    kunu(){
        a=56;
    }
}
