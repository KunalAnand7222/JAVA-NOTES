import java.util.*;
public class lec6_pairsinarray {
    //2 4 6 8 10
    //first hold and pair with all then 2mnd hold pair with all
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }int total=0; //(n)(n-1)/2
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                total++;
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
        System.out.println(total);
    }
    
}
