import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<Integer>() ;
        System.out.println(q1.add(56));
        System.out.println(q1.offer(98));
        System.out.println(q1.contains(98));
        q1.poll();
        System.out.println(q1.peek());
        System.out.println(q1);
        Deque<Integer> q3=new ArrayDeque<>();
        q3.offerFirst(8778);
        ArrayDeque<Integer> q2=new ArrayDeque<>();
        q2.offerFirst(89);
        
    }
    
}
