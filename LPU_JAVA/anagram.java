import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        // outer:\
        int sumi=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            int count=0;
            // inner:
            for(int j=0;j<b.length();j++){
                if(c==b.charAt(j)){
                    count++;
                    break;
                }

            }
            if(count==0){
                sumi++;
                System.out.println("not anagram");
                break;
            }
        }
        if(sumi==0){
System.out.println("anagram");
        }
    }
    
}
