public class string {
    public static void main(String[] args) {
        // cancat() a.concat(b)
        // a.length()
        // string is a class and variable is object
        // immutable
        // if we give int value and convert to string it gives value acc to unicode value
        // a.charAt(index)
        char[] a={'a','b','c','d'};
        String b=new String(a,1,3);//can access a substring or more char using this (char aaray,index,last index)  count from st index to includeing last index
        System.out.println(b);
        // string c=new String(b,1,4);
        System.out.println();
        // System.out.println(b(a,1,5));
        // a.tocharArray()
        // getchars(st index,last index+1,name of array where u want to insert,from which index u want to insert in array)
        System.out.println("kuni".lastIndexOf("n"));
        
        

    }
    
}
