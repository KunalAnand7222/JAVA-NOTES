public class lec6_conditional {
    public static void main(String[] args) {
        int marks=35;
        if(marks>=33){
            System.out.println("Pass!");
        }
        if(marks<33){
            System.out.println("hello");
        }
        else{  //this else block is a part of if hello not of pass
            System.out.println("Fail");
        }
    }
    
}
