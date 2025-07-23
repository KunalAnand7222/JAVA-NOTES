public class stringpractice {
    public static void main(String[] args) {
        int aq=9;
        System.out.println(Integer.toBinaryString(aq));
        String str="1010";
        System.out.println(Integer.parseInt(str,2));//decimal
        // int c=Integer.parseInt(aq,2);
        String az=Integer.toString(aq);
        // int ci=Integer.parseInt(az,2);
        // System.out.println(ci);
        System.out.println(az+56);
        String aa="hello world";
        System.out.println(aa.endsWith("ld"));
        System.out.println(aa.startsWith("hl"));
        System.out.println(aa.indexOf("l"));
        System.out.println(aa.lastIndexOf("l"));
        System.out.println(aa.compareTo("aoo"));
        String bb=aa.concat("!");
        System.out.println(aa.concat("!"));
        System.out.println(aa);
System.out.println(aa.equalsIgnoreCase("hello worlD"));
char ac[]=new char[10];
aa.getChars(0,4,ac,3);
for(char i:ac){
    System.out.println(i);
}
int ad=98;
String ae=String.valueOf(ad); 
System.out.println(ae+98);

       StringBuilder a=new StringBuilder("hello world");
       System.out.println(a.delete(0,3));
        
     
    
}
}
