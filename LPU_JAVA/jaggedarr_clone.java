import java.util.Scanner;

public class jaggedarr_clone {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Rows: ");
        // int rows,cols;
        // rows=sc.nextInt();
        // int jag[][]=new int [rows][];
        // for(int i=0;i<rows;i++){
        //     System.out.print("Cols: ");
        //     cols=sc.nextInt();  //we are creating a new array of every rows
        //     jag[i]=new int[cols]; //mistake
        //     for(int j=0;j<cols;j++){
        //         jag[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<jag.length;i++){
        //     // cols=sc.nextInt();
        //     for(int j=0;j<jag[i].length;j++){
        //         System.out.print(jag[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // int a[]={1,2};
        // System.out.println(a);
        // int b[];
        // // a=b;
        // b=a;
        // b=a.clone(); //using this there will be no impact if change a then no ipact on b
        // b[0]=10;
        // a[0]=15;
        // for(int i:a){
        //     System.out.println(i);  //10 2 because array is by refernece and a is assigned to b and changing b will also change a
        // }
        // for(int i:b){
        //     System.out.println(i);
        // }
        int o[][]={{1,5,6},{1}};
        int p[][];
        p=o.clone();
        o[1][0]=6;
        for(int i=0;i<o.length;i++){
            for(int j=0;j<o[i].length;j++)
            System.out.println(o[i][j]);
        }



        //fn declare parameter
        //fn call argument


    }
    
}
