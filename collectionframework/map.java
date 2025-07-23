import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        Map<Character,Integer> m1=new HashMap<>();
        // for(Character ch:a.toCharArray()){
        //     // m1.put(ch,0);
        //     if(m1.containsKey(ch)){
                
        //         m1.put(ch,m1.get(ch)+1);
        //     }else{
        //         m1.put(ch,1);
        //     }
        // }
        m1.put('p',2);
        m1.put('e', 4);
        m1.put('a',6);
        System.out.println(m1);
        TreeMap<Character,Integer> t1=new TreeMap<>(m1);
        System.out.println(t1);
        for(Character ch:t1.keySet()){
            System.out.println(ch);
        }
    }
    
}
