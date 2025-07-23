import java.util.*;
public class calculaatorswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter first number: ");
        int first_num=sc.nextInt();
        System.out.print("ENter second number: ");
        int second_num=sc.nextInt();
        System.out.print("Enter operation you want to perform: ");
        char ch=sc.next().charAt(0);  //method to take input as char from user
        switch(ch){
            case '+':
            System.out.println("Sum of first and second num is: "+(first_num+second_num));
            break;
            case '-':
            System.out.println("Subtraction of first and second num is: "+(first_num-second_num));
            break;
            case '*':
            System.out.println("Multiplication of first and second num is: "+(first_num*second_num));
            break;
            case '/':
            System.out.println("Division of first and second num is: "+(first_num/second_num));  //only gives integer value
            break;
            case '%':
            System.out.println("modulus of first and second num is: "+(first_num%second_num));
            break;
            default:
            System.out.println("Invalid symbol entered");



        }
    }
    
}
