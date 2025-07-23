import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class capp3 {
    public static void main(String[] args) {
        try{
        File f1=new File("kk.txt");
        Scanner sc= new Scanner(f1);
        System.out.println("kuni");
        System.out.println(f1.length());
        String b="";
        // while(sc.hasNext()){
        //     String a=sc.next();
        //     if(a.length()>b.length()){
        //         b=a;
        //     }
        //     StringBuilder a1=new StringBuilder(a);
        //     System.out.print(a1.reverse()+" ");
        //     // System.out.println(a);
        // }
        while(sc.hasNext()){
            String a=sc.nextLine();
            if(a.length()>b.length()){
                b=a;
            }
            System.out.println(a);
        }
        System.out.println(b);
        sc.close();
        }
        catch(FileNotFoundException j){
            System.out.println("error");
        }
    }
    
}
