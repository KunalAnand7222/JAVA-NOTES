import java.util.*;
public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter income of a person: ");
        int income=sc.nextInt(),tax;
        if(income<=500000){
            tax=0;
            System.out.println("You have to pay 0% tax ");
        }else if(income<=1000000&&income>500000){
            tax=(int)(income*0.2);
            System.out.println("you have to pay 20% tax i.e. : "+ (income*0.2));
        }else{
            tax=(int)(income*0.3);
            System.out.println("You have to pay 30% tax i.e. : "+(income*0.3));
        }
        System.out.println(tax);

        
    }
    
}
