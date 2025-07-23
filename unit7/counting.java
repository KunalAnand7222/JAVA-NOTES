import java.util.*;

public class counting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int temp=Integer.MIN_VALUE; //assign temp as -infinity

        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        int arr1[]=new int [temp+1];
        int arr2[]=new int[10];
        // System.out.println(arr1[3]);
        for(int i=0;i<arr.length;i++){
            int c=arr[i];
            arr1[c]+=1;
        }
        int f=0;
        for(int i=0;i<arr1.length;i++){
            
            for(int j=0;j<arr1[i];j++){
                arr2[f++]=i;
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        
    }
    
}
