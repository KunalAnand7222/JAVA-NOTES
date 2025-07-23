import java.util.Scanner;

public class lec1String {
    public static void main(String[] args) {
        //string is basically a array of character
        char arr[]={'a','b','c'};
        String c="abcd";
        String d=new String("abcd");
        //String are immutable in java cant change it 
        Scanner sc=new Scanner(System.in);
        // String a=sc.next();  //cant take input only upto spac
        String b=sc.nextLine();  //can include with everything use this instead of next
        // System.out.println(a);
        System.out.println(b);
        System.out.println(c.length());  //length is a function return no. of character in a string 
        //in array length is a property so not use braces but in string length is a function
        System.out.println(c+d);   //use + sign to concatenate
    }
    
}
