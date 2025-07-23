public class gen_inter_genclass {
    public static void main(String[] args) {
        kuni<String,Integer> k1=new kuni<>();
        System.out.println(k1.fun());
    }
}
interface kun<t,h>{
    t fun();
}
class kuni<t,h> implements kun<Integer,Boolean>{
    public Integer fun(){
             return 56;  
    }
}
