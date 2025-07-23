public class oractice {
    public static void main(String[] args) {
        String a="helll";
        String b=a.replace('l',' '); //replacing a char is possible in string not in builder
        System.out.println(b);
        char c1[]=a.toCharArray();
        
        // converting to lower or upper only in string
        // startswith and ends with valid in string not in builder
        StringBuilder ss=new StringBuilder();
        System.out.println(ss.capacity());
        StringBuilder sb=new StringBuilder("kunal");
        sb.append(" kuni");
        System.out.println(sb);
        sb.insert(0,"hello ");
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.replace(0,4,"hello");
        System.out.println(sb.substring(0,6));
        System.out.println(sb.indexOf("l"));
        System.out.println(sb);
        System.out.println(sb.lastIndexOf("l"));
        char a1[]=new char[10];
        sb.getChars(0,2,a1,3);
        for(char i:a1){
            System.out.println(i);
        }
        char c2='2';
        System.out.println(Character.isDigit(c2));
        String c3=new String("hello kunu welcome to ca");
        String c4[]=c3.split(" ");
        for(String i:c4){
            System.out.println(i);
        }
        double d1=56.9899;
        int d2=5666;
        System.out.printf("%+,6d",d2);
        System.out.println();
        System.out.printf("%2.2f",d1);
        System.out.println(Integer.toBinaryString(d2));
        String s1="1010";
        // System.out.println(Integer.toString(d2));
        System.out.println(Integer.parseInt(s1,2));
        // System.out.println(s1.to));
        
        


        
        
        
    }
    
}

