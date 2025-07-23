import java.io.File;
public class lec3 {
    public static void main(String[] args) {
       try{
        File obj=new File("E:/Users/LENOVO/OneDrive/New folder/Java shradha/javabasics/lpu/kuni.txt");
        if(obj.createNewFile())
        {
            System.out.println("file Created ");
        }
        else{
            int counter=1;
            while(true){
                File objj=new File("E:/Users/LENOVO/OneDrive/New folder/Java shradha/javabasics/lpu"+counter+".txt");
                if(objj.createNewFile()){
                    System.out.println("File Created ");
                    break;
                }else{
                    System.out.println("File NOte Creayed ");
                }
                counter++;
            }
        }
       }
       catch(Exception e){

       }
        }
    
}