import java.util.*;
public class largestoftwono {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("A is largest of all");
        }else if(b>a&&b>c){
            System.out.println("B is largest of all");
        }else{
            System.out.println("C is largest of all");
        }
        
    }
    
}
