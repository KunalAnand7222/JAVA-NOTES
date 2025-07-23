import java.util.Scanner;

public class rockpaaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Character ch[][]=new Character[3][5];
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if(j%2!=0){
                    ch[i][j]='|';
                }
                else{
                    ch[i][j]=' ';
                }
            }
        }
        for(int i=0;i<9;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            
        }
       
        
    }
    public static boolean check(Character ch[][]) {
        if((ch[0][0]=='o'&&ch[0][2]=='o'&&ch[0][4]=='o')||(ch[0][0]=='x'&&ch[0][2]=='x'&&ch[0][4]=='x')){
                return true;
        }
        if((ch[0][0]=='o'&&ch[1][2]=='o'&&ch[2][4]=='o')||(ch[0][0]=='x'&&ch[1][2]=='x'&&ch[1][4]=='x')){
            return true;
    }
        
        return false;
    }
}
