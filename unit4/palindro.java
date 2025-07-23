public class palindro {
    public static void main(String[] args) {
        //inner loop 
        // i to 1 and 2 to i 
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            int temp=i;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(temp);
                temp--;
                if(temp==1){
                    System.out.print(temp);
                    check(temp,i);
                    break;
                }
                
            }
            System.out.println();
        }
       
    } public static void check(int temp,int i){
        for(int j=1;j<=i-1;j++){
            temp++;
            System.out.print(temp);
        }
            
    }
    
}
