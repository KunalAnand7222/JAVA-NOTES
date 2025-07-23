import java.util.*;
public class lec1_2darray {
    //2d array is collection of multiple 1d array
    public static void main(String[] args) {
        // int x=null; error
        int num[][]=new int[2][3];//representation of 2d array
        //no.of cells =row*column
        Scanner sc=new Scanner(System.in);
        //no.of rows=matrix.length and no. of column =matrix[0].length
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                num[i][j]=sc.nextInt();

            }
            
        }
        int key=sc.nextInt();
        int temp=Integer.MIN_VALUE;
        int tempi=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                if(temp<num[i][j]){
                    temp=num[i][j];
                }if(tempi>num[i][j]){
                    tempi=num[i][j];

                }
                

            }
            System.out.println();
            
        }
        System.out.println("Largest is: "+temp+" and smallest is: "+tempi);

        
    }
    
}
