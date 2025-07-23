import java.util.Scanner;

public class mathtest {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        int min=Math.min(first,second);  //can use min as variable name and only two argument in min function
        System.out.println(min);
        int max=Math.max(first,second);
        System.out.println(max);
        double sqrt=Math.sqrt(first); //always store pow and sqrt in double data type
        System.out.println(sqrt);
        double pow=Math.pow(second,first); //(second)^first
        //first one is base and second one is power
        System.out.println(pow);
        int abs=Math.abs(first-second); //gives positive value can store in int also
        System.out.println(abs); 
        //Math.avg() is not a inbuilt function in java
        System.out.println(Math.cbrt(first)); //for cube root
        System.out.println(Math.log(first)); //with base e
        System.out.println(Math.log10(first)); //find log with base 10
        System.out.println(Math.exp(first)); //for exponential
        System.out.println(Math.hypot(first,second)); //returns hypotenuse
       

        }
    
}
