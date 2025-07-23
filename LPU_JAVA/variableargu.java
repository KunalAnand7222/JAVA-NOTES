public class variableargu {
    //variable argument required same type of argument declare by three dot
    public static void main(String[] args) {
        variableargu v1=new variableargu();
        v1.fun();  //no output because we are not passing any argu
        v1.fun(2,3,5);
        // v1.fun("ku",56); same type must be
        v1.fun(0.5f,5.6f);
        v1.fun('a','b'); //it will automatically call higher memory space fun like char can call int value
        // v1.fun("kun","fun"); error 
        
        
    }
    //just call which is higher like char call int not float
    void fun(int... a){
        System.out.println("...........................");
        for(int i:a){
            System.out.println(i);
        }
    }
    void fun(float...a){
        System.out.println("/////////////");
        for(float i:a){
            System.out.println(i);

        }
    }
    
}
