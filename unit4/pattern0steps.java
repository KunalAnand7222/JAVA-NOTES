public class pattern0steps {
    public static void main(String[] args) {
        //first identify no. of rows
        //second identify no. of column'
        //make logic
        //hollow rectangle 
        //i==1||i==4||j==1||j==5 boundary line * else " " space
        int num=6;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==num||j==1||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
