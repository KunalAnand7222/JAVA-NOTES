public class lec8_ternaryoperator {  //ternary means 3 operands
    //used to write if else statement in a single line
    public static void main(String[] args) {
        // variable=condition?statement1:statement2;​
        //mistake in between no semicolon ":" this sign
        String check=(899>98)?"89 is greater":"98 is greater";
        System.out.println(check);
        int marks=6;
        String checki=(marks>=33)?"pass":"fail";
        System.out.println(checki);


        
    }
    
}
