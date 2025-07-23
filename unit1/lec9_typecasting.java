public class lec9_typecasting {
    public static void main(String args[]){
        float a=56.4f;
        int b=(int)a;  //int b=int(a)  wrong syntax  this means a is declared as int type but it actually is float thats why its showing error
        System.out.println(b);
        // int s=564;
        // String k=(String)s;
        // System.out.println(k);  cant convert from int to string or string to int 
        char ch='a';  //if we convert char to int its showing their ascii value  //ascii value of a is 97 and A is 65 
        int num=ch;
        System.out.println(num);
    }
}