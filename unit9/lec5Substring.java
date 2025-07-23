public class lec5Substring {
    public static void main(String[] args) {
        // substring means continuous part
        //(0,4) means 4 char in substring means at 0 1 2 3 (4 not inc;lude)
        String s="Kunu kuni";
        System.out.println(str(s,0,6));
        System.out.println(s.substring(0,6));  //stringname.substring(st index,end index) inbuilt dunction used to display substring

    }
    public static String str(String s,int i,int j){
        String a="";   //create empty string then concatenate every char to this to form substring 
        for(int k=i;k<j;k++){
            a+=s.charAt(k);
        }
        return a;

    }
    
}
