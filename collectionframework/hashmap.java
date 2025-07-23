import java.util.HashMap;
import java.util.Map;
// key value
public class hashmap {
    public static void main(String[] args) {
        Map<String,Integer> m1=new HashMap<>();
        m1.put("a",1);
        m1.put("b",2);
        m1.put("c",3);
        // m1.put("c",4); it will overwrite the key value of c
        System.out.println(m1.containsKey("v"));
        System.out.println(m1.containsValue(3));
        System.out.println(m1.get("b"));
        m1.putIfAbsent("d",6);//first check if key if absent then it add to map
        // for(int i=0;i<m1.size();i++){
        //     System.out.println(m1.get());
        // }
        System.out.println(m1.keySet());//used to print only key
        System.out.println(m1.values());//used to print values
        System.out.println(m1);
        System.out.println(m1.isEmpty());
        for(String s:m1.keySet()){
      System.out.println(s);
        }
        for(Integer i:m1.values()){
        System.out.println(i);
        }
        for(String s:m1.keySet()){
            int v=m1.get(s);//return given values of key
            System.out.println(s+" "+v);
        }
            
        
    }
    
}
