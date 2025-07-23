import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class capp2 {
    public static void main(String[] args) {
        try{
            File f1=new File("kk.txt");
            FileWriter f2=new FileWriter(f1);
            f2.write("Hello i am kunalioio anand.\nwelcome back to my youtube");
            // f2.write("welcome back to my home");
            f2.close();
            System.out.println(f1.getName());
        }
        catch(IOException i){
            System.out.println("error");
        }
    }
    
}
