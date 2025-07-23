public class nestedclass {
    public static void main(String[] args) {
        // kuni k1=new kuni();
        nestedclass n1=new nestedclass();
        // creating object of nested class 
        // main class.nested class var=obj of main class.new nested class
        // creating a instance of inner class within main class
        nestedclass.kuni k1= n1.new kuni();
        k1.ku();
        nestedclass.kunu k2=n1.new kunu();
        k2.ki();

    }
    public class kuni{
          void ku(){
            System.out.println("kuni function");

          }
    }
    public class kunu{
        void ki(){
            System.out.println("kunu function");
        }
    }
}
