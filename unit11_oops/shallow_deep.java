public class shallow_deep {
    public static void main(String[] args) {
        // shallow refernce effect
        // deep new address no effect
        stu s1=new stu();
        s1.marks[0]=96;
        stu s2=new stu(s1);
        s1.marks[0]=101;
        System.out.println(s2.marks[0]);

    }
    
}
class stu{
    int marks[];
    stu(){
        marks=new int[1];

    }
    stu(stu s1){
        for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
        }

    }

}
