import java.util.HashSet;
import java.util.Set;

public class sett {
    // set is a collection of unordered unique element
    public static void main(String[] args) {
        // Set<Integer> s1=new Set<>(); cant write like this because set is a interface and we cant create object of interface
        Set<Integer> s1=new HashSet<>();
        // return randomly value while linkedlist return sequentially value in which order u inserted 
        s1.add(null);
        s1.add(56);
        s1.add(66);
        s1.add(32);
        s1.add(96);
        s1.add(96);//cant insert duplicate value it will throw out and show only unique value
        System.out.println(s1);
        s1.remove(56);//used to remove sepecific element from set
        System.out.println(s1);
        System.out.println(s1.contains(112));//return true if elemnt is present
        System.out.println(s1.isEmpty());//return true if empty
        System.out.println(s1.size());//return no. of element present inside set
       s1.clear();//clear all element from set
    //    use when we dont want to create a new set just clear and use this set 
       System.out.println(s1.isEmpty());
       System.out.println(s1);
        
    }
    
}
