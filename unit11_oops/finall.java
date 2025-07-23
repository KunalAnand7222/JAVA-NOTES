public class finall {
    public static void main(String[] args) {
        final int a=56;
        // a++; a is with final keyword so cant be assigned anyhow again its fixed now
        // System.out.println(a++); error
    }
}
class parent{
    final void kunu(){
        System.out.println("parent class");
    }
}
class base extends parent{
    // void kunu(){ if parent class contain any method with final keyword it cant be created in base class with same name
    //     System.out.println("base class");
    // }
}
final class kuni{ //cant create base class of this if class is with final keyword

}
// class kunu extends kuni{  
//    cant create extended of kuni bcz of final keyword
// }
//     final:

// When applied to a variable, final indicates that the variable's value cannot be changed once it has been initialized.
// When applied to a method, final indicates that the method cannot be overridden by subclasses.
// When applied to a class, final indicates that the class cannot be subclassed.
