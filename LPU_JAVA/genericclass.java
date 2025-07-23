public // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class genericclass {
    public static void main(String[] args) {
    //   kun<String,Integer> k1=new kun<String,Integer>();
       kun<Integer,Integer> k2=new kun<Integer,Integer>();
    //   k1.fun("kuni",56);
       k2.fun(56,98);
    }
}
class kun<h,v>{
    h a;
    void fun(h b,v c){
        // if(h.instanceOf())
        a=b;
        // int d=Integer.valueOf(b);
        // int e=Integer.valueOf(c);
        int d=(Integer)b;
        int e=(Integer)c;
        // System.out.println(b+" "+c);
        System.out.println(d+e);
    }
} 
