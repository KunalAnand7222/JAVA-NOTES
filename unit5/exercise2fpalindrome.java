import java.util.*;
public class exercise2fpalindrome {
    //palindrome means number and their reverse must be same
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
      //   System.out.println(first.tostring();
        System.out.println(check(first));

        
    }
    public static boolean check(int a){
         int rev=0,temp=a;
         for(int i=0;a>0;i++){
            int rem=a%10;
            rev=rem+(rev*10);
            a/=10;

         }
         if(rev==temp){
            return true;
         }else{
            return false;
         }
    }
    
}
