public class localclasss {
    public static void main(String[] args) {
        
    }
    
}
class a{
    class b{
        void kun(){
            if(true){
                class c{
                    void kun1(){
                        System.out.println("C class fun");

                    }
                }
                c c1=new c();
                c1.kun1();
            }
            // c c1=new c();
            //     c1.kun1(); cant create outside if else 
        }
    }
}
