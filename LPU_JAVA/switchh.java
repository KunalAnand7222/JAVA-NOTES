import java.util.*;
// switch also works with string character integer
public class switchh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        switch(m){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid");
        }
        if(n>100){
            System.out.println("YOu are topper");
        }
        else if(n>=96){
            System.out.println("A+");
        }else if(n>=91){
            System.out.println("A");

        }else if(n>=81){
            System.out.println("B+");
        }else if(n>=71){
            System.out.println("B");
        }else if(n>=61){
            System.out.println("c+");
        }else if(n>=51){
            System.out.println("c");
        }else if(n>=35){
            System.out.println("D");
        }else if(n>=0){
            System.out.println("E");
        }else{
            System.out.println("invalid");
        }
        String x="kuni";
        switch (x){
            case "kunu":   //cant make duplicate case
            System.out.println("kunu");
            break;
            case "kuni":
            System.out.println("kuni");
            break;
            default:
            System.out.println("Default");
        }
        // float p=10.2f;   //first convert float value into string then it will be executed
        // String s="10";
        // int a=Integer.parseInt(s);
        // String b=float_to_String(p);
        // System.out.println(a);
        // switch(p){
        //     case 10.2f:
        //     System.out.println("kuni");
        //     break;
        // }
       //can crete nested switch
       
        
    }
    
}
