public class overriding {
    public static void main(String[] args) {
        b b1=new b();
        System.out.println(b1.kun());
    }
}
class a{
    int kun(){
            return 0;
    }
}
class b extends a{
    // int kun(){
    //     return 56;
    // }
    float kun(){
         return 0.2f;
    }
}
