import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class longestwordfromfile {
    public static void main(String[] args) {
        try{
            File f1=new File("C:\\Users\\LENOVO\\OneDrive\\New folder\\Java shradha\\javabasics\\lpu");
            Scanner sc=new Scanner(f1);
            int count=0;
            String s=" ";
            while(sc.hasNext()){
                String data=sc.next();
                // count=data.length();
                if(data.length()>count){
                    count=data.length();
                    s=data;
                }

            }
            System.out.println(count+" "+s);
        }
        catch(FileNotFoundException e){
            System.out.println("not found");
        }
    }
    
}
