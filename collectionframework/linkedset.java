import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedset {
    public static void main(String[] args) {
        Set<Integer> s1=new LinkedHashSet<>();
        // Mistake:linkedhashset not linkedset
        // return randomly value while linkedlist return sequentially value in which order u inserted 
        s1.add(null);
        s1.add(56);
        s1.add(66);
        s1.add(96);
        s1.add(96);
        System.out.println(s1);//display in same order
    }
    
}
