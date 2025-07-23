public class exam2 {
    public static void main(String[] args) {
        int num=0;
        // int fac=facto(num);
        // System.out.println(fac);
        System.out.println(facto(5));
    }
    public static int facto (int a){
        int facti=1;
        for(int i=a;i>=0;i--){
            if(i==0){
                // return facti;   never use return statement inside loop it will throw error
                facti*=1;
                break;
            }else{
                facti*=i;
            }
        }
        return facti;
        
    }
    
}
