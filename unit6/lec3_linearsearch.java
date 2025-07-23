import java.util.*;
public class lec3_linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter key to be search: ");
        int key=sc.nextInt();
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int a=check(arr,key);
        System.out.println("Key found at "+a+" position.");
        
    }
    public static int check(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    
}
