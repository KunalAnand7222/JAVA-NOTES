public class thiskeyword {
    int age,marks;
    String name;
    thiskeyword(int age,int marks,String name){
        age=age;  //if we donot use this keyword it will assign locl age to local and if we try to access it it give default
        marks=marks;
        name=name;
        this.age=age;  //assigning local to instance variable 
        this.marks=marks;
        this.name=name;
        this.kun(); //can access using this keyword
        kun();
    }
    void kun(){
        System.out.println(age+marks+name);
    }
    public static void main(String[] args) {
        thiskeyword k1=new thiskeyword(10,10,"kunu");

        
    }
    // object of class is used to call instance,constructor,method of a class from outside the class and this keyword is uesd to call the same from inside the class
    // static variable,instance variable,instance block and constructor is execuuted(after creation of instance objects of class)
    // static i block is called before instance i block.
    //instance i block can be called multiple times but static i block can be called only once
    
}
