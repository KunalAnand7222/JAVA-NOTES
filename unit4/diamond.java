public class diamond {
    public static void main(String[] args) {
        //first half then another half
        int num=10;
        for(int i=1;i<=num/2;i++){
            for(int j=1;j<=num/2-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=num/2;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*(num/2-i))+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
