// import javax.print.DocFlavor.STRING;

public class boundedtypes {
    public static void main(String[] args) {
        kun<Integer> k1=new kun<>();
        kun<Float> k2=new kun<>();
        kun<Double> k3=new kun<>();
        kun<Short> k4=new kun<>();
        kun<Long> k5=new kun<>();
        // kun<Object> k6=new kun<>(); cant bcz 
        // k1.kunu(56,98);
        // k2.kunu(56.f,98.f);
        // k3.kunu(56.0,87.0);
        // k4.kunu((short)65,(short)98);
        // k5.kunu(59L,87L);
        k1.add(56,98);
        k1.sub(98,56);
        k1.Mul(98,56);
        k1.div(89,89);


        // kun<String> k2=new kun<>(); if bounded is of number we cant able to create object of string class
        // kun1<String> k2=new kun1<>();

    }
    
}
// class kun<t extends Number>{
//     t a;
//     void kunu(t b){
//         a=b;
//         System.out.println(b.intValue()+98);
//     }
// }
class kun<t extends Number>{
    t a;
    void add(t b,t c){
        a=b;
        System.out.println(b.intValue()+c.intValue());
    }
    void sub(t b,t c){
        a=b;
        System.out.println(b.intValue()+c.intValue());
    }
    void Mul(t b,t c){
        a=b;
        System.out.println(b.intValue()+c.intValue());
    }
    void div(t b,t c){
        a=b;
        System.out.println(b.intValue()+c.intValue());
    }
}
// class kun1<t extends Object>{ //father of every class
//     t a;
//     void kunu(t b){
//         a=b;
//         System.out.println(b);
//     }

// }
