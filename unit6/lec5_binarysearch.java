import java.util.*;
public class lec5_binarysearch {//array is in sorted order already
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter key to be search: ");
        int key=sc.nextInt();
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(binary_search(arr,key));


    }
    public static int binary_search(int arr[],int key){
        int length=arr.length;
        int mid=length/2;
        for(int i=0;;i++){
            if(key==arr[mid]){
            return mid;
            }else{
            if(key>arr[mid]){
                mid=(length+mid+1)/2;  //mistake

            }
            else{
                mid=((mid-1)/2);

            }
        }
        
        
        return -1;}
    
    
}
    
}
//iteration 1 n
//it 2 n/2
//it 3 n/4
//it k n/2^k     n=2^k   k=logn
