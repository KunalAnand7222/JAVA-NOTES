public class pattern_hollowrho {
    public static void main(String[] args) {
        //hollow pattern using matrix approach
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            //hollow rectangle
            for(int k=1;k<=5;k++){
                if(i==1||i==num||k==1||k==num){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // for(int i=1;i<=num*2-1;i++){
        //     if(i<=num-1){
        //         System.out.print(" ");
        //     }else{
        //         System.out.print("*");
        //     }
        // }
        // System.out.println();
        // for(int i=2;i<=num;i++){
        //     if(i==num){
        //         for(int k=1;k<=num;k++){
        //         System.out.print("*");
        //         }
        //     }
        //     for(int j=1;j<=num*2-1;j++){
                
        //         if((i+j)==6||(i+j)==10){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
    
}
