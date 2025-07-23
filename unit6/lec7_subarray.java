import java.util.*;

public class lec7_subarray {  //n(n+1)/2
    //continuous part of array
    //2 4 6 8 : 2 4 8 is not subarray
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        subarray(arr);
    }
    public static void subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count;
            count=i;
            // System.out.println(arr[i]);
            for(int j=i;j<arr.length;j++){
                // count=i+1;
                count++;
                for(int k=i;k<count;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
