import java.util.*;

public class lec3palindrome {  //ulta pulta same 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)==a.charAt(a.length()-i-1)){
                continue;
            }else{
                count++;
                System.out.println("not a palindrome");
                break;
            }
        }
        if(count==0){
            System.out.println("palindrome");
        }
    }
    
}
