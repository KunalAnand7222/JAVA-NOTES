import java.util.*;
public class exercise2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter number you want to check: ");
        int num=sc.nextInt();
        String check=num%2==0?"Number is even":"Number is odd";
        System.out.println(check);
        System.out.print("Enter temperature of your body to check: ");
        Double temp=sc.nextDouble();
        String check2=temp>100?"You have fever":"You dont have fever";
        System.out.println(check2);
        System.out.print("ENter number between 1 to 7: ");
        int day=sc.nextInt();
        switch(day){
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
        
    }
    
}
