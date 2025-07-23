import java.util.*;
public class shortestpath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int verti=0,hori=0;
        // System.out.println("kunu".length());
        // System.out.println(s[2]);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='N'){    //learn
// cant iterate like s[i] like in c++ we have to use s.charAt(i) for iteration
                 verti++;
            }else if(s.charAt(i)=='S'){
                verti--;
            }else if(s.charAt(i)=='E'){
                hori++;
            }else{
                hori--;
            }

        }
        System.out.println(hori+" "+verti);
        double sq=Math.pow(hori,2)+Math.pow(verti,2);  //initially at origin 
        //if not then (x2-x1)^2 + (y2-y1)^2 ka sqrt x1 and y1 is origin
        System.out.println(Math.sqrt(sq));

    }
    
}
