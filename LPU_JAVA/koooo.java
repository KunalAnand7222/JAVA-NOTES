import java.util.*;
public class koooo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int count=0;
        while(i<=n){
            i++;
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    for(int l=1;l<=n;l++){
                        if(j!=k&&j!=l&&k!=l){
                            System.out.print(j+""+k+""+l);
                            System.out.println();
                            count++;
                           
                        }
                        if(count==((n)*(n-1)*(n-2))){
                            break;
                        }
                    }
                    if(count==((n)*(n-1)*(n-2))){
                        break;
                    }
                }
                if(count==((n)*(n-1)*(n-2))){
                    break;
                }

            }
            
        }
        System.out.println(count);
    }
    
}
