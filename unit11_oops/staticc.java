public class staticc {
    public static void main(String[] args) {
// static used to share the same variable or method of a given class
// /which can be make static:
// properties(var),functions(),blocks,nested classes
        //static used to decrease space complexity as it made only once in memory 
        human h1=new human();
        h1.walk="can walk";
        System.out.println(h1.walk);
        human h2=new human();
        System.out.println(h2.walk);
        men h3=new men();
        h3.kunu();//changing the value of walk
        // if we change the calue of static variable it will be changed for every object
        // if we initialize just once of static variable it will be availablle for every object
        System.out.println(h2.walk);
        System.out.println(h1.walk);
    }
    
}
class human{
    String name;
    static String walk;

}
class men extends human{
    void kunu(){
        walk="cant walk";
    }
    
}



// static:

// When applied to a variable, static indicates that the variable belongs to the class rather than to instances of the class. There will be only one copy of the variable shared among all instances.
// When applied to a method, static indicates that the method belongs to the class and can be invoked without creating an instance of the class.
// When applied to a nested class, static indicates that the nested class is a static nested class, which can be accessed without an instance of the enclosing class.
