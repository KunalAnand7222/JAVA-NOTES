import java.util.*;
public class selection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int temp=i;  //stre i not arr[i] mistake 
            for(int j=i+1;j<arr.length;j++){
                if(arr[temp]>arr[j]){
                    temp=j;  //change temp not arr

                }

            }
            int to=arr[i];
            arr[i]=arr[temp];
            arr[temp]=to;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
