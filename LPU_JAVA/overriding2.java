public class overriding2 {
    public static void main(String[] args) {
        b b1=new b();
        a a1=new b();
       System.out.println(b1.kun(50));
    //   System.out.println(a1.kun());
    // if there is any change in argument data type and same return type then no over riding it do over loading 
    // for overriding return type must be same or else error 
    // we cant create same fun name with different return type in both parent and base class
    
    }
}
class a{
    int kun(int a){
            return 0;
    }
}
class b extends a{
    int kun(float b){
        return 56;
    }
}
