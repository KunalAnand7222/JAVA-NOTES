import java.util.*;
public class file2 {
    public static void main(String[] args) {
        Map<Integer,Integer> m1=new TreeMap<>();
        for(int i=0;i<5;i++){
            m1.put(i,i+1);
        }
        for(Integer i:m1.keySet()){
            System.out.println(i+" "+m1.get(i));
        }
        System.out.println();
        for(Integer i:m1.values()){
            System.out.println(i+" "+m1.get(i));
        }
        System.out.println(m1.containsKey(3));
        String ab[]=new String[10];
        for(int i=0;i<10;i++){
            ab[i]="a";
        }
        m1.clear();
        int count=1;
        Map<String,Integer> m2=new TreeMap<>();
        for(int i=0;i<10;i++){
             if(m2.containsKey(ab[i])){
m2.put(ab[i],count++);
             }else{
                m2.put(ab[i],0);
             }
        }
        for(String i:m2.keySet()){
            System.out.println(i+" "+m2.get(i));
        }
    }
    
}
