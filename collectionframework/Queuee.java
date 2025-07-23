import java.util.LinkedList;
import java.util.Queue;
// queue can be implement using linkedlist

public class Queuee {
    // first in first out
    public static void main(String[] args) {
        Queue<String> s1=new LinkedList<>();
        s1.offer("Kuni");//can do this using add
        // 2nd one all throw error if condition not satisfied and first one return null value means no exception
        s1.offer("kii");
s1.offer("kii");//insert element in queue
        s1.offer("kii");
        for(String i:s1){
            System.out.println(i);
        }
        System.out.println(s1.poll());//remove first element that we inserted into queue
        // can do this using remnove 
        System.out.println(s1.peek());//peek element
        //can do this using element()

    }
    
}
