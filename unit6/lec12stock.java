import java.util.*;

public class lec12stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int profit=0,buy=arr[0];
        for(int i=0;i<arr.length;i++){
            int sell=arr[i];
            int pro=sell-buy;
            profit=Math.max(pro,profit);
            buy=Math.min(buy,sell);
        }
        System.out.println(profit);
    }
    
}
