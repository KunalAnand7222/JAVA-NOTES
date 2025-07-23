import java.util.Scanner;

public class lowertoupper {
    public static void main(String[] args) 
    {
        char c='c'-32;
        System.out.println(c);
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder update=new StringBuilder("");
        char ch=Character.toUpperCase(s.charAt(0));
        // update+=ch;
        update.append(ch); //use append in stringbuilder
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '&&i<s.length()-1){  //2nd condition
                // char ch=(s.charAt(i+1))-32; cant add int value in charat fun
                // ch=ch-32;
                // System.out.println(char(ch-32));
                update.append(s.charAt(i));
                char chi=Character.toUpperCase(s.charAt(i+1));
                update.append(chi);
                i++;
                continue;
                
            }else{
            update.append(s.charAt(i));
            }

        }
        String sb=update.toString(); //used to convert stringbuilder into string
        System.out.println(sb);


    }
    
}
