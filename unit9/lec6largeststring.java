public class lec6largeststring {
    public static void main(String[] args) {
        String str[]={"kunu","kuni","kiooo","kuniu"};
        // System.out.println(str[0]>str[1]); cant compare > sign of string
        System.out.println(str[3].compareToIgnoreCase(str[1]));//string.compareTo used to compare string
        //if 1st string is greater return +ve if smaller -ve if equal 0 value
        // System.out.println(str[4].compareTo(str[5])); //normal compare to also include lower or uppercase then compare 
        String su=s(str);
        System.out.println(su);

    }
    public static String s(String s[]){
        String largest=s[0];  //not use "" bcz ascii value we dont know and it comp acc to ascii value
        for(int i=0;i<s.length;i++){
            int a=largest.compareToIgnoreCase(s[i]);
            System.out.println(a);
            if(a<0){
                largest=s[i];
            }
        }
        return largest;
    }
    
}
