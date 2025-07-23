// import java.util.HashMap;
import java.util.*;
public class ff1 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("kuni");
        l1.add("koi");
        System.out.println(l1.get(1));
        l1.sort(null);
        System.out.println(l1);
        for(int i=0;i<l1.size();i++){
            if((l1.get(i)).equals("kuni")){
                System.out.println(i);
            }
        }
        List<String> l2=new ArrayList<>();
        l2.addAll(l1);
        System.out.println(l2);
        l1.remove(0);
        System.out.println(l2+" "+l1);
       l1.set(0,"pok");
       System.out.println(l1);
       System.out.println(l1.contains("pok"));

       Stack<Integer> s1=new Stack<>();
       s1.push(56);
       s1.push(98);
       s1.push(32);
       System.out.println(s1.get(0));
       for(Integer i:s1){
        System.out.println(i);
       }
       System.out.println("peek: "+s1.peek());
       s1.pop();
       System.out.println(s1.peek());
System.out.println("Queue: ");
       Queue<Integer> q1=new LinkedList<Integer>();
        q1.offer(12);
        q1.offer(23);
        q1.offer(10);
        System.out.println(q1);
        System.out.println(q1.peek());
        q1.poll();
        System.out.println(q1.peek());

        System.out.println("Priority queue : ");
        Queue<Integer> q3=new PriorityQueue<>();//min heap
       q3.offer(12);
       q3.offer(14);
       q3.offer(10);
       q3.offer(0);
       q3.offer(100);
       q3.offer(89);
       q3.remove(12);
       System.out.println(q3);
       Queue<Integer> q2=new PriorityQueue<>(Comparator.reverseOrder());
       q2.offer(12);
       q2.offer(14);
       q2.offer(10);
       q2.offer(0);
       q2.offer(100);
       q2.offer(89);
       q2.remove(12);
       System.out.println(q2);
       System.out.println("Array deque: ");
       ArrayDeque<Integer> a1=new ArrayDeque<>();
       a1.offer(12);
       a1.offerFirst(85);
       a1.offerLast(98);
       System.out.println(a1);
       System.out.println(a1.pollFirst());
       System.out.println(a1.pollLast());
       System.out.println("Set: ");
       Set<Integer> s2=new HashSet<>();
       s2.add(98);
       s2.add(23);
       s2.add(98);
       s2.add(12);
       System.out.println(s2);
       s2.remove(98);
       System.out.println(s2);
       System.out.println(s2.contains(12));
       System.out.println("Tree set: ");
       Set<Integer> s3=new TreeSet<>();//print all in ascending order
       s3.add(98);
       s3.add(23);
       s3.add(98);
       s3.add(12);
       System.out.println(s3);
       s3.remove(98);
       System.out.println(s3);
       System.out.println(s3.contains(12));
       System.out.println("Hsh map: ");
       
    //     Map<String, Integer> m1 = new HashMap<>();
    //     m1.put("a",5);
    //     m1.put("b",2);
    //     m1.put("c",3);
    //     m1.put("d",6);
    //     System.out.println(m1);
    //     System.out.println(m1.values());
    //     System.out.println(m1.containsKey("c"));
    //    for(String s:m1.keySet()){
    //     System.out.println(s+" "+m1.get(s));
    //    }
    //    System.out.println(m1.get(2));
       Map<String, Integer> m2 = new TreeMap<>();//in sorted manner
        m2.put("a",5);
        m2.put("g",2);
        m2.put("f",3);
        m2.put("d",6);
        System.out.println(m2);
        System.out.println(m2.values());
        System.out.println(m2.containsKey("c"));
        System.out.println(m2.keySet());
        System.out.println(m2.containsValue(6));
        m2.put("d", 10);
        System.out.println(m2);
        String a="eidhj";
        

    }
    
}
