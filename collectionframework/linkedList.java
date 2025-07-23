import java.util.LinkedList;


public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(56);
        l1.add(98);
        l1.add(1,988);
        l1.addFirst(600);
        l1.addLast(988);
        System.out.println(l1);
        LinkedList<Integer> l2=new LinkedList<>();
        l2.addAll(l1);
        System.out.println(l2);
    }
    
}
