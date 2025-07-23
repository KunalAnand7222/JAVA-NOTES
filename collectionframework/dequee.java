import java.util.ArrayDeque;
import java.util.*;
// using arraydeque we can implement stack also just use polllast instead of poll

public class dequee {
    // doubly ended queue can insert element at st and also at end and same case with removal
    public static void main(String[] args) {
        ArrayDeque<Integer> q1=new ArrayDeque<>();
        q1.offer(56);
        q1.offer(98);
        q1.offerFirst(97);//is available in arraydeque not in queue
        // insert element at first
        // q1.offerLast(0);same as normal offer
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.peekFirst());//same as normal peek
        System.out.println(q1.peekLast());//display first elemnt from last
        System.out.println("poll");
        System.out.println(q1.pollFirst());//remove first element samne as normal poll
        System.out.println(q1.pollLast());//remove last
        System.out.println(q1);
        
    }
    
}
