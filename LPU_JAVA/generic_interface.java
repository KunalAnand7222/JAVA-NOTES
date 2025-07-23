public class generic_interface {
    public static void main(String[] args) {
        kuni k1=new kuni();
        // k1.fun();
        System.out.println(k1.fun());
        
        }
    
}
interface kun<t,h>{
      h fun();
}
class kuni implements kun<Integer,String>{
//   public Integer fun(){
//     return 56;
//   }
   public String fun(){
       return "joshi c";
   }
}
