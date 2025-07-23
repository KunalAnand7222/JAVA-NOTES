public class lec9_switch {
    public static void main(String[] args) {
        //public so that compiler can access it 
        //string args is command line argument
        //static means no need to create object
            // System.out.println(n+" * "+i+" = "+n*i);
            //system is class out obj and println is method


            //Switch is like choose one value and it gives something
            int num=4;
            switch(num){  //we can also pass char string and int data type only
                case 1:
                System.out.println("one");
                break;  //if we donot use break statement here and if one one condition is true then below all condition treated as true and it will execute whole below statement
                case 4:
                System.out.println("four");
                break;
                default:  //for if no statement is true then it will execute
                System.out.println("if no one execute then it will execute");
            }
            char ch='b';
            switch(ch){
            case 'b':
            System.out.println("true");
            break;
            default:
            System.out.println("false");
            }
            // float n=2.4f;
            // double n=2.4;   cant pass double,float data type
            // Double n=2.4;
            String n="kunu";
            switch(n){
                case "kunu":
                System.out.println("True");
                // break;
                default:
                System.out.println("False");
            }

        
        
    }
    
}
