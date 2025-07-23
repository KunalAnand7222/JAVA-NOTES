public class lec4compare {
    public static void main(String[] args) {
        String s="kunu";
        String k="kunu";
        String a=new String("kunu");  //interning concept
        if(s==k){
            System.out.println("Equal");  //s and k are equal because in memory they point to same kunu 
            // but in case of new keyword a separate memory is assigned to a and there store kunu value so not equal
            //== equal to compare on basis of where they are means their location
        }
        if(s==a){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        if(s.equals(a)){  //use always .equals to compare becz it compare with their value to with their location
            System.out.println("Equal");
        }
    }
    
}
