import java.util.*;
public class localclassssss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        a a1=new a();
        a.b b1=a1.new b();
       boolean check=a1.kun(k);
       if(check){
           System.out.println("Prime");
       }else{
           b1.kun1(k);
       }
        
    }
    
}
class a{
   
    boolean kun(int a){
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;

    }
    class b{
        void kun1(int k){
            if(true){
            class c{
                void kunu(){
            if(k%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("Odd");
            }
                }
            }
            c c1=new c();
            c1.kunu();
            }
            // System.out.println("Nested class function");

        }
    }
    // static class c{
    //     void kun(){
    //         System.out.println("Static nested class");
    //     }
    // }
}

//A$1b.class 1 is for local class 