import java.util.HashMap;
import java.util.Scanner;

public class bankingsystem {
    static HashMap<String,Integer> h1=new HashMap<>();
    static Scanner sc=new Scanner(System.in);
    static int initial_balance=0;
    public static void main(String[] args) {
        System.out.println("Welcome To Central Bank Of India! ");
        System.out.println("Press 1 for Add details\nPress 2 for show details\nPress 3 for exit");
        
       for(int i=0;i<3;i++){
        System.out.print("Presss number between 1 to 3: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                Add();
                break;
            case 2:
                Display();
                break;
            case 3:
                break;
        }
    }
        

    }
    public static void Add() {
        sc.next();
        String name=sc.nextLine();
        int balance=sc.nextInt();
        h1.put(name,initial_balance+balance);
        initial_balance=initial_balance+balance;
    }
    public static void Display() {
        sc.next();
        String search=sc.nextLine();
        System.out.println(search);
        if(h1.containsKey(search)){
            System.out.println(search+": "+h1.get(search));
        }else{
            return ;
        }
        
    }
    
}
