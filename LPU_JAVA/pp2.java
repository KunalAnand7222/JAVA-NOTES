import java.util.Arrays;

public class pp2 {
    public static void main(String[] args) {
        String s="kunu";
        String s1="nukui";
        char a1[]=s.toCharArray();
        char a2[]=s1.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2));
        int a=9878;
        String a3=String.valueOf(a);
        StringBuilder a4=new StringBuilder(a3);
        StringBuilder a5=a4.reverse();
        String a6=a5.toString();
        System.out.println(a3.equals(a6));
        System.out.println("hello\"kun\"");
        
    }
    
}
