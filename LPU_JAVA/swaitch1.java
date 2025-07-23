import java.util.Scanner;

public class swaitch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int n=sc.nextInt();
        System.out.print("Enter choice: ");
        int x=sc.nextInt();

      switch (x){
        case 2:
        System.out.println("current account check: ");
        if(n<18){
            System.out.println("current account can be opened");
        }else if(n<21){
            System.out.println("Saving account can be opened but can open current account");
            // System.out.println("You are eligible for open saving account");
        }else{
            System.out.println("You are not eligible for saving account");
        }
        break;
        case 1:
        System.out.println("You are eligible for open saving account");
        

      }

    }
   
    
}
