import java.util.Scanner;

public class practice {
    //  String str= s.replaceAll("[^a-zA-Z0-9]", ""); used to replace all char except number and var
    public static void main(String[] args) {
        String aaa="kuni kuni kiii hui";
        System.out.println(aaa.replaceAll(" ","@"));
        System.out.println(aaa.replace(" ", "@"));
        String bbb[]=aaa.split(" ");
        System.out.println(aaa.toUpperCase());
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(~-6);
        
    }
    
}
