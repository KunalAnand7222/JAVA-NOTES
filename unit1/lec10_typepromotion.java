public class lec10_typepromotion {
    //type promotion is always with expression not with a normal variable
    public static void main(String[] args) {
        char ch='a';   //first convert to int then evaluate
        byte by=56;
        int g=ch+by;// possible
        char f=(char)(ch+by);//first add up both then convert to char 
        //due to type promotion exp char and byute convert to int and we are storing int value in char as it losses some data so error
          //adding two different and store in char not possible
        //we can directly add up in syso 
        System.out.println(f);
        System.out.println(ch+by);
        System.out.println(ch);  //gives a it donot automatically convert to int in printing like c++
        int a=56;
        float b=56.4f;
        double c=56.5; //store in data type which has more storage otherwise showing error
        // int kun=a+b+c; like this
        double ku=a+b+c;
        System.out.println(ku);

    }
    
}
