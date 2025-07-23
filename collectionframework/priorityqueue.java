import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
// all method of queue is vlid in priority queue

public class priorityqueue {
    // priorityqueue is insied queue interface
    public static void main(String[] args) {
        Queue<Integer> q1=new PriorityQueue<>();
        q1.offer(56);        
        q1.offer(51);
        q1.offer(58);
        q1.offer(50);
        System.out.println(q1);//display minheap 
        System.out.println(q1.poll());//remove element which has highest priority in this case smallest element has highest priority
        System.out.println(q1);//always do heapify and make a min heap
        Queue<Integer> q2=new PriorityQueue<>(Comparator.reverseOrder());//used to convert minheap to mnaxheap now it will do heapify and make maxheap
        q2.offer(56);        
        q2.offer(51);
        q2.offer(58);
        q2.offer(50);
        System.out.println(q2);
        System.out.println(q2.poll());


    }
    
}
