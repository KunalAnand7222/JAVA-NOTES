import java.util.*;

public class lec9subarraysum {  //n(n+1)/2
    //continuous part of array
    //2 4 6 8 : 2 4 8 is not subarray
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int n=(arr.length*(arr.length+1))/2;
        int arr2[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        subarray(arr,arr2);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        int temp=Integer.MAX_VALUE;
        int TEMPI=Integer.MIN_VALUE;
        for(int i=0;i<arr2.length;i++){
            if(arr[i]<temp){
                temp=arr2[i];
            }
            if(arr2[i]>TEMPI){
                TEMPI=arr2[i];
            }
        }
        System.out.print("Minimum is: "+temp+" and maximum sum is: "+TEMPI);
        
        
       
    }
    public static void subarray(int arr[],int arr2[]){
        int f=0;
        for(int i=0;i<arr.length;i++){
            int count;
            count=i;
            // System.out.println(arr[i]);
            for(int j=i;j<arr.length;j++){
                // count=i+1;
                count++;
                int sum=0;
                for(int k=i;k<count;k++){
                    sum+=arr[k];
                    // System.out.print(arr[k]+" ");
                }
                // System.out.println("sum= "+sum);
                arr2[f++]=sum;
                System.out.println();
            }
            System.out.println();
        }
        

    }
    
}
