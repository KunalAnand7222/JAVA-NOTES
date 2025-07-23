import java.util.ArrayList;
import java.util.List;
import java.util.*;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class lec1Arraylist {
    // set is for unique value
    // collection: list set queue
    public static void main(String[] args) {
        ArrayList<String> k1=new ArrayList<>();//create an empty array
        // size n+n/2+1
        // it will create a new array and copy all element in new array

        // Arraylist <type? object
        k1.add("kuni");
        k1.add("kunu");
        System.out.println(k1);
        List<Integer> list=new ArrayList();
        list.add(56);
        System.out.println(list);
        list.add(98);//add element at last
        list.add(1,97); //this will add at given position
        System.out.println(list); 
        List<Integer> list1=new ArrayList();
        list1.add(10);
        list1.addAll(list);//add elements of list at last 
        System.out.println(list1);
        System.out.println(list.get(1));//return element at given index
        list.remove(1);//remove element at given position
        System.out.println(list);
        list.set(1,00);//update the value at given index
        System.out.println(list);
        list.remove(Integer.valueOf(56));//remove given elemnt
        // Integer is of type list
        System.out.println(list);
        list.clear();//remove all
        System.out.println(list);//empty list []
        System.out.println(list1.contains(98));//it will return if element is present
        // Iteration in list
        for(int i=0;i<list1.size();i++){//list.size is of how many elemnt present in list not of their size
            System.out.println(list1.get(i));
        }
        for(Integer i:list1){//for each loop
            System.out.println(i);
        }
        System.out.println("For each loop");
        for(int i:list1){//can also use int inplace of integer
            System.out.println(i);
        }
        // iterator usinbg iterator
        Iterator<Integer> it=list1.iterator();
        while(it.hasNext()){//hasnext check whether next element is present or not
            System.out.println("Iterator "+it.next());//display next element
            // print and moves pointer to next position
        }



        
    }
    
}
// using arraylist we can dynamically store element in array
// Arraylist is a class that implements list interface
//time compl O(n)
// if u once clear list and try to update value before clear expression it will update but list is already cleared
// clear
// set use before clear after execution of clear