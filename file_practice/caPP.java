import java.util.*;
import java.io.File;
import java.io.IOException;
public class caPP {
    public static void main(String[] args) {
        try{
            File f1=new File("kk.txt");
            if(f1.createNewFile()){
                System.out.println("created");
            }else{
                System.out.println("already");
            }
        }
        catch(IOException j){
              System.out.println("error");
        }
    }
    

}
