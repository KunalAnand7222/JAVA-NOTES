public class lec5_constructor {
    public static void main(String[] args) {
        // constructor : auto called at the time of object creation
        // have same name as class or structure
        // dont have return type
        // called only once at time of object creation
        //memory allocation happens when constructor is called
        Student s1=new Student();
        
        
    }
    
}
class Student{
    String name;
    int age;
    Student(){
        System.out.println("COnstructor called!.....");
        // name="kuni";
        // age=56;
    }
    
}
