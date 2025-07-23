import java.util.*;

public class isomorp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        Set<Character> s1=new HashSet<>();
        Set<Character> s2=new HashSet<>();
        for(int i=0;i<a.length();i++){
            s1.add(a.charAt(i));
        }
        for(int i=0;i < b.length();i++){
            s2.add(b.charAt(i));
        }
        System.out.println(s1.size()+" "+s2.size());
    }
    
}
