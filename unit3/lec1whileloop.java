import java.util.*;
public class lec1whileloop {
    //loops means repetable thing 
    public static void main(String[] args) {
        // while(condition){

        // }
        int i=5;//initialize
        //if conditiion is always true then infinite loop
        while(i>=0){  //while(0 or 1) in java 1 is not treated as true or 0 is not as false
            //cond check then print again check again print if false then exit loop
            System.out.println("welcome kb");
            i-=1;
        }
        int j=0;
        while(j<10){
            j++;
            System.out.print(j+" ");
            // j++;
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        while(k<=n){
            System.out.println(k);
            k++;
        }
        int sum=0,l=1;
        while(l<=n){
            sum+=l;
            l++;
        }
        System.out.println(sum);
    }
    
}
