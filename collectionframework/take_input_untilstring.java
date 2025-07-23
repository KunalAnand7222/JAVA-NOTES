import java.util.Scanner;

public class take_input_untilstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        //    if(!sc.hasNextInt()){
            String aa=sc.nextLine();
           if(!((aa.charAt(0)<='z'&&aa.charAt(0)>='a')||(aa.charAt(0)>='A'&&aa.charAt(0)<='Z'))){
            break;
           }
        }
    }
    
}
