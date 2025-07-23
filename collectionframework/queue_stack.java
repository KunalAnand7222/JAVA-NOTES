import java.util.Scanner;
import java.util.Stack;

public class queue_stack  {
 public static void main(String[] args) {
    Stack<Integer> obj=new Stack<>();
    Stack<Integer> obj1=new Stack<>();
    Scanner sc=new Scanner(System.in);
    int a;
    do{
        System.out.println("Press 1 for Push\n Press 2 for Pop\t");
        a=sc.nextInt();
        switch (a) {
            case 1:
                while (!obj.empty()) {
                    obj1.push(obj.pop());
                }   
                obj.push(sc.nextInt());
                while (!obj1.empty()) {
                    obj.push(obj1.pop());
                }
                System.out.println(obj);
                System.out.println("Top= " +obj.peek());
                break;
            case 2:
                obj.pop();
                System.out.println(obj);
                break;
            }

    }while(a<=2);
    
 }
    
}