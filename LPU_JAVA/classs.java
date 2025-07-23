public class classs {
    public static void main(String[] args) {
        bc b1=new bc();
        b1.kun(96,57);
    }
    
}
class ab{
   int a=56;
   int b=96;
}
class d extends ab{
    int a=96,b=57;
}
class bc extends d{
    void kun(int a,int b){
        if(super.a==a&&this.b==b){ //used to refer immediate parent class
            System.out.println("success");
        }else{
            System.out.println("not");
        }
    }
}
