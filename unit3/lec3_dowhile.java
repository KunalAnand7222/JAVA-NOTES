public class lec3_dowhile {
    public static void main(String[] args) {
        //always print one statement even condition is false
        int i=1;
        do{
            ++i;
            System.out.println("Kunu");
            // ++i;
            if(i==3){
                break;  //help to exit the loop
            }
        }while(i<5);
        //first print then increment then check
        for(int j=0;j<5;j++){
            if(j==3){    //it will skip value of 3 
                continue;  //skip the iteration (except word then use continue)
            }
            System.out.println(j);
        }
    }
    
}
