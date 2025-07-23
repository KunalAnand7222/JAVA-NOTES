public class lec8_blockscope {
    int k=56;
    public static void main(String[] args) {
        // {
        //     //block of java inside curly braces 
               //if we declare any variable inside this braces we cant use it outside the block
               //variable which is inside the if else or for loop block known as block scope.
               //variable which is declare inside the main method or outside the for if else block known as method scope
               
        // }
        int k=87;
        if(true){
            // int k=89;
            System.out.println(k);
        }
    }
    // System.out.println(k);
    
    
}
