public class stringadd {
    // stringBuilder is a mutable string
    public static void main(String[] args) {
        String a="5";
        String b="4";
        int c=a.charAt(0);
        for(int i=49;i<=b.charAt(0);i++){
            c++;
        }
        System.out.println((char)(c));
        String d="kuni";
        d.toUpperCase();
        System.out.println(d);
        // string(str) lengthofstr+16 in string builder length is character means 16*2 
        // default 16
        // int  what value u passed is length
        // .capacity() and length only gives length of string 
        // length char including space
        // ensurecapacity() length=2*(capacity+1)
        // if length = pass value no need to use formula (int cap)
        // set length a.setlength(10) it will update a to 10 length
        // a.charAt donot update string builder
        // a.setcharAt(index,what u want to insert) overwrite the previous value
        // a.getchars(st index,end index(consider last index -1),chartarget[](in which array u want to insert),targetstart(from which position u want to insert in new array ))
        //  a.append() add at last of string
        // a.append(int)
        StringBuilder aa=new StringBuilder("kun");
        aa.append(10);
        System.out.println(aa);
        // a.insert(st index wher u want to insert string,string)
        //used to reverse entire 
        System.out.println(aa.reverse());
        System.out.println(aa==aa.reverse());//it will treat both same du to mutable store in other obj then compare
        // a.delete(st index,end(treat -1))
        // a.replace(st index,end index,string u want to replace with)
        // a.substring(st index,end index) need obj of string class
        String bb;
        bb=aa.substring(2);
        System.out.println(aa);
        
    }
    
}
