public class exam1 {
    public static void main(String[] args) {
        int a=10,b=50;
        int pro=product(a,b);
        System.out.println(pro);
         pro=product(15,6); //cant make duplicate variable for calling
        System.out.println(pro);
    }
    public static int product(int m,int n){
           return m*n;
    }
    
}
