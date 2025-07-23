import java.util.*;
public class dcshj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> l1=new ArrayList<>();
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            l1.add(a);
        }
        int b=sc.nextInt();
        System.out.println(l1);
    }
    
}
