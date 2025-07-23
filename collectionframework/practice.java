import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,6,8,9,7};
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<a.length;i+=2){
            a1.add(i,a[i]);
        }
        for(int i=1;i<a.length;i+=2){
            a1.add(i,a[i]);
        }
        System.out.println(a1);
        
    }
}
