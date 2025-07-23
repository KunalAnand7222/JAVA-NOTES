import java.util.*;
public class lec1array {
    public static void main(String[] args) {
        //Array: 0 to n-1 
        //starting from 0 bcz java is zero based indexing 
        //List of elements of same data type stored in contiguous location of memory 
        //cant store different type elemnt in a single array
        //for integer 100 104 108 112 bcz int have 4 byte
        //datatype arrayname[]= new datatype[size]
        //Array size is fixed cant change during run time
        int age[]=new int[10];
        int num[]={1,5,6};  //java auto identify size of array
        //if we donot store any value in array it auto assign 0 value to it
        String nu[]=new String[10];
        System.out.println(age[9]);
        System.out.println(nu[0]); //in case of string empty array gives null value
        // String ku[10];  cant declare array in this way as in c++
        String[] ku=new String[10]; //can also declare array in this way
        System.out.println(ku[5]);
        char[] ki=new char[10];
        System.out.println(ki[1]);//empty char array donot give any input
        double[] kii=new double[10];
        System.out.println(kii[2]); //gives 0.0
        




    }
    
}
