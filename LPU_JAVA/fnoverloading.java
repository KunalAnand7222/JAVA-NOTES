public class fnoverloading {

    //return type must be same no need to check fn type like void or int but return must same
    //type of fun must be same
    public static void main(String[] args) {
        fnoverloading f1=new fnoverloading();
        f1.area(5);
        f1.area(2,3);
        f1.area(3.2f);

        
    }
    void area(int a){
        System.out.print("Square: ");
        System.out.println(a*a);

    }
    void area(int a,int b){
        System.out.print("Rectangle: ");
        System.out.println(a*b);
        
    }
    void area(float a){
        System.out.print("circle: ");
        System.out.println(3.14*a*a);
        
    }
    
    
}
