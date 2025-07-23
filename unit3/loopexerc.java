import java.util.*;
public class loopexerc {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){  //first initialize then condition check then go inside curly braces then increment from above of for loop
            System.out.println("Kunu");
            i+=2;
        }
        Scanner sc=new Scanner(System.in);
        int sum_even=0,sum_odd=0;
        for(int i=0;i<10;i++){
            int num=sc.nextInt();
            if(num%2==0){
                sum_even+=num;
            }else{
                sum_odd+=num;
            }
        }
        System.out.println("Sum of all even number is: "+(sum_even));
        System.out.println("Sum of all odd number is: "+(sum_odd));
        int num=sc.nextInt(),fact=1;
        for(int i=0;i<=num;i++){
            if(i==0){
                fact*=1;
            }else{
                fact*=i;
            }
        }
        System.out.println("factorial of "+num+" is: "+fact);
    }
    
}
