public class operations {
    public static void main(String[] args) {
        // get ith bit
        int a=5;
        int i=1;
        System.out.println(a&(1<<(i)));
        // if this is 0 then 0 else ith bit is 1
        // bits start from 0th bit

        // set ith bit
        a=a|(1<<i);
        // perform or operation ...set bit means set ith bit to 1
        System.out.println(a);

        // clear ith bit
        // set ith bit to 0
        int b=5;
        int i1=2;
        // first left shift ith times then compliment 1 then peform and operation
        b=b&(~(1<<i1));
        System.out.println(b);

        // update ith bits
        // update ith bits to 0 or 1 
        // if updated value is 1 then do set ith bits else clear ith bits
        
        // clear last i bits
        // 111 100 
        int c=7;
        int i2=1;
        c=c&(-1<<i2);
        // c=c&(~0<<i2);
        System.out.println(c);

        
    }
}
