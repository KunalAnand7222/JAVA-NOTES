import java.util.*;

public class foreachloop {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int arr[]=new int[5];
        int arr[]={1,5,6,9,7,0};
        Arrays.sort(arr);
     //mistake arr[] dont use this in for each
        for(int i:arr){  //when it first time run it will point to first element of array then so on
            //best in terms of time and space complexity
            //if we want to print iteration then use count variable
            // arr[i]=sc.nextInt();  cant take input in for each loop 
            System.out.println(i);
            if(i%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
        
    }
    
}
