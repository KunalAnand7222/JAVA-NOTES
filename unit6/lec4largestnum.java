import java.util.*;
public class lec4largestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int large=largest(arr);
        System.out.println("Largest number is : "+ large);
        
    }
    public static int largest(int arr[]){
        int temp=Integer.MIN_VALUE; //assign temp as -infinity
        int tempi=Integer.MAX_VALUE; //assign temp as +infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
            if(arr[i]<tempi){
                tempi=arr[i];
            }
        }System.out.println(tempi);
        return temp;

    }
    
}
