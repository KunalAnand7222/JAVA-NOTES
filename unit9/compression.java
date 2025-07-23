import java.util.Scanner;

public class compression {
    public static void main(String[] args) {
        StringBuilder sc=new StringBuilder("");
        Scanner sc1=new Scanner(System.in);
        String s=sc1.nextLine();
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                continue;
            }else{
                System.out.print(s.charAt(i)+"");
            }
            if (count!=1) {{
                System.out.print(count+"");
            }
                
            }
        }

    }
    
}
