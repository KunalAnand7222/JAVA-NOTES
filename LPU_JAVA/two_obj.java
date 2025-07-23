public class two_obj {
    int a,b,c;
    two_obj(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int kun(){
        return a*b*c;
    }

    public static void main(String[] args) {
        two_obj k1=new two_obj(10,20,30);
        two_obj k2=new two_obj(2,4,6);
        int v1=k1.kun();
        int v2=k2.kun();
        System.out.println(v1+" "+v2);
    }
    
}
