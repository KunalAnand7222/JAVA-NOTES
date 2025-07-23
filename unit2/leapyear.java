import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        
        System.out.print("Enter year: ");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        //leap year condition year sshould be div by 4 or not div by 100 or div by 400
        if(year%400==0||year%4==0&&year%100!=0){
            System.out.println("year is leap year");
        }else{
            System.out.println("Year is not a leap year");
        }


    }
    
}
