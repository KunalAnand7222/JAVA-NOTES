import java.io.*;
public class lec1 {
    public static void main(String[] args) {
        Console k=System.console();
        // here we are not assingning any memory to object just taking input using system input output stream
        System.out.println("Enter your name: ");
        String a=k.readLine();
        System.out.println("Welcome "+a);
        char ch[]=k.readPassword();
        String kuni=String.valueOf(ch);//converting char array to string
        System.out.println(kuni);
    }
    
}
// try as resources means inside try there is scanner class and when try will execute it will automatically close scanner class

