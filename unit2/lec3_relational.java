public class lec3_relational {
    public static void main(String[] args) {
        int a=98;
        int b=98;
        System.out.println(a==b);   //return boolean value after checking 
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        if(a==b){
            System.out.println("A is equal to b");
        }else{
            System.out.println("A is not equal to b");
        }
        if(a!=b){
            System.out.println("A is not equal to b");
        }else{
            System.out.println("A is  equal to b");
        }
        if(a>b){
            System.out.println("A is greater than b");
        }else{
            System.out.println("A is lesser than b");
        }
        if(a>=b){
            System.out.println("A is greater or equal to b");
        }else if(a<=b){
            System.out.println("A is lesser or  equal to b");
        }
    }
    
}
