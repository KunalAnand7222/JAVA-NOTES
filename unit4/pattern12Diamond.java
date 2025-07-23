import java.util.Scanner;

public class pattern12Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num=sc.nextInt();
        
       for(int i=1;i<=(num/2);i++){
         for(int j=1;j<=(num/2)-i+1;j++){
            System.out.print(" ");
         }
         for(int k=1;k<i;k++){
            System.out.print("*");
         }
         System.out.print("*");
         for(int k=1;k<i;k++){
            System.out.print("*");
         }
         System.out.println();


       }
       for(int i=1;i<=num;i++){
        System.out.print("*");
       }
       System.out.println();
       for(int i=1;i<=(num/2);i++){
        for(int j=1;j<=i;j++){
           System.out.print(" ");
        }
        for(int k=1;k<=(num/2)-i;k++){
            System.out.print("*");
        }
        System.out.print("*");
        for(int k=1;k<=(num/2)-i;k++){
            System.out.print("*");
        }

        
        System.out.println();


      }

        
    }
    
}
