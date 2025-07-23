public class hybrid {
    public static void main(String[] args) {
        // combo of everything
        // base--derived--
        // multiple ingeritance --multiple parent cvlass and single derived class
        hh h1=new hh();
        ht h2=new ht();
        h1.look();
        h2.look();
    }
    
}
class stu{
    void look(){
        System.out.println("smart.....");
    }
}
class color extends stu{
    int lo;
}
class ht extends stu {
int po;
}
class hh extends ht{
int pp;
}
