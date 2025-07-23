import java.util.Scanner;

public class lec11kadanesalgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum>max){
                max=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println(max);
    }
    
}
