public class lpu1 {
    // public class lec9_switch {
        public static void main(String[] args) {
            //public so that compiler can access it 
            //string args is command line argument
            //static means no need to create object
            // int n=5;
            // for(int i=1;i<=10;i++)
            // {
            //     System.out.println(n+" * "+i+" = "+n*i);
            //     //system is class out obj and println is method
            // }
            // /** for documentation
            String s="Kun";  //comparing objects of string class
            String a="Kum";
            Integer b=10;
            Float c=10.0f;
            Float d=10.0f;
            // int result=s.compareTo(a); //gives integer
            Boolean result=s.equals(a); //gives true false
            // int resul=c.compareTo(b);
            System.out.println(result);
            // System.out.println(resul);
            Integer i=new Integer(10); //boxing
            int f=i.Intvalue();  //unboxing
            int g=i; //auto boxing
            System.out.println(f+g);
            

            
        }
        
    // }
    
}
