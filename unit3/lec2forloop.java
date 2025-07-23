public class lec2forloop {
    public static void main(String[] args) {
        // for(initilisation;condition;updation)
        int i=2;
        for(i=0;i<=3;++i){   //for(i;;) wrong syntax as we have to initialize inside for loop
            //first initialize(just once run ) then check condition then print then update then again check then print and so on 
            System.out.println(i);
        }
    }
    
}
