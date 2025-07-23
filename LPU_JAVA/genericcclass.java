public class genericcclass {
    public static void main(String[] args) {
        kun <Integer> k1=new kun<>();
        System.out.println(k1.kuni(56));
    }
    

}
class kun<k>{
    k a;
    <k>int kuni(k c){
        return (int)c;
    }
}
