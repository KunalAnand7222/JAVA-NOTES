public class count_setbits {
    public static void main(String[] args) {
        int a=21;
        int sum=0;
        while(a!=0){
            if((a&1)==1){sum++;}
            a=a>>1;
        }
        System.out.println(sum);
        // n-> log(n)+1 bits \
        System.out.println(4&2);
    }
}
