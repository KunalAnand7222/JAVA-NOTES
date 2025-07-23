public class lec2stringatchar {
    public static void main(String[] args) {
        String a="Kunu kuni";
        char ch2[]=a.toCharArray();
        System.out.println(a.charAt(3));  //string name.charAt(index) means display char at given position
        for(int i=0;i<a.length();i++){  //use length as fubction always
            System.out.print(a.charAt(i)+" ");   //used to print all char of a string 
        }
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("vowel");
            }
        }
    }
    
}
