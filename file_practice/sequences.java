import java.util.ArrayList;

public class sequences {
    public static int count=0;
    public static void main(String[] args) {
        seq("","abcd");
        System.out.println(count);
        // seq1(null, null);
    }
    
    public static void seq(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            count++;
            return;
        }
          Character ch=b.charAt(0);
        seq(a+ch,b.substring(1));
        seq(a,b.substring(1));

    }
    // public static void seq1(ArrayList<Integer> a,ArrayList<Integer> b){
    //     if(b.isEmpty()){
    //         System.out.println(a);
    //         count++;
    //         return;
    //     }
    //       Integer ch=b.get(0);
    //       b.remove(0);
    //     seq1(a.add(ch),b);
    //     seq1(a,b.remove(0));

    // }
    
}
