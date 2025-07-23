import java.util.*;
public class label {
    
    public static void main(String[] args) {
        
        
        int arr[]={1,5,6,9,7,0};
        int arr1[]=new int[6];
        outer:
        for(int i=0;i<arr.length;i++){
            inner:
            for(int j:arr){
                

                if(j==6){
                    break outer;
                }else{
                    System.out.println(j);
                }
            }
            
        }
        int f=0;
        for(int i=arr1.length-1;i>=0;i--){
            arr1[f++]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
    
}
