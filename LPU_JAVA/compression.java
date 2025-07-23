import java.util.Arrays;
import java.util.Scanner;

public class compression {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        // c[c.length]='';
        Arrays.sort(c);
        int count=1;
        for(int i=0;i<c.length;i++){
            if(i==c.length-1&&count!=1){
                  System.out.println(c[i]+""+count);
                  break;
            }
            if(c[i]==c[i+1]){
                count++;
                continue;
            }else if(count!=1){
                // count=1;
                System.out.println(c[i]+""+count);
                count=1;
            }
            if(count==1){
                System.out.println(c[i]);
            }

        }
    }
    
}
