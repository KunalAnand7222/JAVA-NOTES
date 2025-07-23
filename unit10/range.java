public class range {
    public static void main(String[] args) {
        // clear range of bits
        int d=42;
        int it1=1,it2=4;
        // 11111  output: 10001
        // 10001:   10000|00001
        int e=~0<<(it2+1);
        System.out.println(e);
        int f=(1<<it1)-1;
        System.out.println(f);
        int g=e|(f);
        System.out.println(g);
        System.out.println(g&d); 
    }
}
