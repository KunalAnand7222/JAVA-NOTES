import java.util.*;

public class insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            int temp=arr[i],track=0;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }
                else{
                    track=j+1;

                    break;
                }
            }
            // if(track!=0){
                arr[track]=temp;
            // }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
     

    
}
