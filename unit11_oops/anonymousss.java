// wecan create object of interface using anonymous class or lambda expression
class anonymouss {
    public static void main(String[] args) {
        // kunu k1=()->{
        //     System.out.println("kuni");
            
        // };
        // // k1.kuni(98);
        kunu k1=new kunu(){
            public void kuni(int a){
                System.out.println("Kuni");
            }
        };
        k1.kuni(65);
    }
}
interface kunu{
    void kuni(int p);
}