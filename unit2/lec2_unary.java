public class lec2_unary {
    public static void main(String[] args) {
        int a=9;
        int b=++a;
        // System.out.println(a++); //print then inc so a=10 after print
        System.out.println(b);
        System.out.println(a);
        int c=9;
        int d=c++;  //print then increment
        System.out.println(c);
        System.out.println(d);
        int e=98;
        int f=--e;  //pre decrement 
        System.out.println(e);
        System.out.println(f);
        int g=89;
        int h=g--;//post decrement
        System.out.println(g);
        System.out.println(h); 
    }
    
}
