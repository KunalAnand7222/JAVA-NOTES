import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class stackk {
    // first in last out
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();//cant use primitive data type here
        // push is used to insert and pop is for remove 
        s1.push(56);
        s1.push(98);
        s1.push(97);
        s1.push(12);
        System.out.println(s1);//can directly display using object it show like a list bca of list type
        for(int i:s1){
            System.out.println("push"+i);
        }
        s1.pop();//remove last element
        for(int i:s1){
            System.out.println("pop"+i);
        }
        System.out.println(s1.peek());//display top element or last elemnt we inserted like 1 2 3 4 it display 4
        // Stack<Integer> s2=new ArrayList();
        while (!s1.isEmpty()) {//print until stack get empty
            System.out.println(s1.pop());
        }





    }
    
}
