public class fact {
    public static void main(String[] args) {
        System.out.println(facti(5));
    }
    public static int facti(int n){
        if(n==1){
            return n*=1;
        }
        System.out.print(n*facti(n-1)+" ");
        
        return n*facti(n-1);
        // System.out.println();
    }
    
}
