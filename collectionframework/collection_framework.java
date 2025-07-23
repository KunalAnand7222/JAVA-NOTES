import java.util.*;
// n+(n/2)+1 memory location if insert new element
// first it assign 10  but if u insert 11th element then it copy all data to new location of using above formula 
public class collection_framework {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList(); //can store any type of data
        a1.add(56);
        a1.add("kuni");
        System.out.println(a1);
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> a3=new ArrayList<>();
        a2.add(98);
        a2.add(65);
        a3.add(12);
        a2.addAll(a3);
        System.out.println(a2);//insert element at last
        a2.addAll(2,a3);
        System.out.println(a2.size());
        System.out.println(a2);
        for(int i=a2.size()-1;i>=0;i--){
            System.out.println(a2.get(i));
        }
        // a2.clear();
        a2.set(1, 100);//update given index element
        ArrayList<Integer> a4= (ArrayList<Integer>)a2.clone();//use of clone: copy entire arraylist to new location
        System.out.println(a4);
        a4.add(98);
        a4.add(65);
        a4.sort(null);
        System.out.println(a4);
        // Integer[] a = a4.toArray(new Integer[a4.size()]); list to array
        Scanner sc=new Scanner(System.in);
        while(true){
            //    if(!sc.hasNextInt()){
                String aa=sc.nextLine();
               if(!((aa.charAt(0)<='z'&&aa.charAt(0)>='a')||(aa.charAt(0)>='A'&&aa.charAt(0)<='Z'))){
                break;
               }
            }
            ArrayList<String> l1=new ArrayList<>();
            l1.add("kio");
            l1.add("kopp");
            l1.sort(null);
        
        

        
    }
    
}
