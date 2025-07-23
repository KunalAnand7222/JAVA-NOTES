public class pattern0_1matrix {
    public static void main(String[] args) {
        //always try to approach like matrix like
        //1(1,1)
        //0(2,1) 1(2,2)
        //1(3,1) 0(3,2) 1(3,3)
        //0(4,1) 1(4,2) 0(4,3) 1(4,4)
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2!=0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
    
}
