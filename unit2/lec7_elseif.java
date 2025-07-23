public class lec7_elseif {
    public static void main(String[] args) {
        int a=5;
        if(a>=18 && a<=59){
            System.out.println("adult");
        }else if(a>=60&&a<=90){ //if first if part will false then it will execute otherwise donot 
            System.out.println("about to die");
        }else{
            System.err.println("you are bachcha");
        }
    }
    
}
