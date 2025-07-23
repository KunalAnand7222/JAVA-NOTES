public class lec7_functionoverload {
    public static void main(String[] args) {
        //Function overloading means same function with change in number of argument or change in data type of argument not of function
        //fun overload only based on argument
        //ex: int sum() and float sum() is no ex of fun overload they both are treated as a single fun 
        //donot depend on return type
        System.out.println(sum(5,7));
        System.out.println(sum(1,2,3));
        System.out.println(pro(5,7));
        System.out.println(pro(2.4f,2));

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    //also depends on data type of argument
    public static int pro(int a,int b){ //if data type of fun is diff and name same it usually throw error if argument is also same but if argument is diff then no error
        return a*b;
    }
    public static float pro(float a,int b){
        return a*b;
    }
    
    
}
