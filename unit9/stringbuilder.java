public class stringbuilder {
    public static void main(String[] args) {
        //memory in which string are store or made called string pool or intern pool
        //when we want to update string it donot update a new object will create and then it update
        //ex kunu want to add i it donot add i in kunu and make kunui it create a copy with concatenation it will increase time complexity and space also
        //every time it create a new string to concatenate or copy and var point to new string
        //time will be n but due to copy it become n^2
        //to reduce time or space complexity use string builder
        //to string used to convert into string if only if object
        //ex int a cant but Iteger a can convert
        // int a=56;
        // Integer a=new Integer(56);
        // string s=a.toString;
        StringBuilder sb=new StringBuilder("");
        // StringBuilder sb=""; cant initialize like this 
        for(char ch='a';ch<='z';ch++){
            sb.append(ch); //used to append char in string builder
            // sb+=ch; undefined in string builder 
        }
        System.out.println(sb);

        //try to use string builder always
        //o(n)

        
    }
    
}
