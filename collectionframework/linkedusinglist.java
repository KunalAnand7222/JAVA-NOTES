import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// All property of list can be implemented in linkedlist

public class linkedusinglist {
    public static void main(String[] args) {
         ArrayList<String> k1=new ArrayList<>();//create an empty array
        // size n+n/2+1
        // it will create a new array and copy all element in new array

        // Arraylist <type? object
        k1.add("kuni");
        k1.add("kunu");
        System.out.println(k1);
        List<Integer> list=new LinkedList<>();
        list.add(56);
        System.out.println(list);
    }
}
