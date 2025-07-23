import java.util.Scanner;

public class compression1 {
    public static void main(String[] args) {
        StringBuilder sd=new StringBuilder("");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        //can also do like shradha di done like use a while loop also inside for loop if i!=i+1 terminate while loop(s[i]!=s[i+1]&&i<s.length-1)
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                continue;
            }else{
                // System.out.print(s.charAt(i)+"");
                sd.append(s.charAt(i));
            }
            if (count!=1) {
                // System.out.print(count+"");
                sd.append(count);
                count=1;
            }
                
            }
            sd.append(s.charAt(s.length()-1));
            if(count!=1){
                sd.append(count);
            }
            System.out.println(sd);
        }


    }
    
// }
