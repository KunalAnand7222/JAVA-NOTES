import java.io.File;

public class lec2 {
    public static void main(String[] args) {
        System.out.println("kuni");
        File f1=new File("C:/Users/LENOVO/OneDrive/New folder/Java shradha/javabasics/lpu");
        if(f1.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("error");
        }
    }
    
}
