
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class file1 {
    public static void main(String[] args) {
        File f1=new File("filename.txt");
        try{
            Scanner sce=new Scanner(f1);
            while(sce.hasNextLine()){
                String a=sce.nextLine();
                System.out.println(a);
            }
        }catch(IOException i){
            System.out.println("pooo");
        }
    }
    
}
