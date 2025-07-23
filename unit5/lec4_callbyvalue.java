import java.util.*;
public class lec4_callbyvalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);

    }
    public static void swap(int a,int b){ //receive a copy of and b not actual
        a=12;
        System.out.println(a); //print 12 not passsing value
        int temp=b;
        b=a;
        a=temp;
        System.out.println(a+" "+b);
        return;


    }
    //call by value means we are passing copy of that variable so if there any change in that variable in other function there is no impact on that variable in main function
    //there is no call by reference in java means we cant change actual variable
    
    
}
