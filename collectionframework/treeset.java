import java.util.HashSet;
import java.util.*;

public class treeset {
    public static void main(String[] args) {
        Set<Integer> s1=new TreeSet<>();
        // display output in sorted order
       
        // s1.add(null); treesaet donot allow null value it throw error
        s1.add(56);
        s1.add(66);
        s1.add(96);
        s1.add(96);
        System.out.println(s1);
        s1.remove(66);
        System.out.println(s1);
    }
    
}
