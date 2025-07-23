public class practice3 {
    public static void main(String[] args) {
        kun k2=new kun();
        k2.outer();
        
    }
    
}
class kun{
    kun message;
    void outer(){
        class kuni{
            void display(){
                System.out.println("Local class");
            }
        }
        kuni k1=new kuni();
        k1.display();
    }
}
