import java.util.*;
public class le2passing_array {
    public static void main(String[] args) {
        //array is in pass by refernce category
        //can change the value of variable in main with update in other function using array passing
        Scanner sc=new Scanner(System.in);
        int age[]=new int[5];
        for(int i=0;i<4;i++){
            age[i]=sc.nextInt();

        }
        System.out.println(age.length);
        for(int i=0;i<4;i++){
            System.out.print(age[i]+" ");
        }
        change(age); //mistake dont use age[] during calling
        for(int i=0;i<4;i++){
            System.out.print(age[i]+" ");
        }
    }
    public static void change(int age[]){
        for(int i=0;i<age.length;i++){ //age.length to get length of array(not like how many elemnt present in aaray like have 4 elemnt but size is 5 so it gives 5(age.length)
            age[i]=age[i]+1;
        }
    }
    
}
