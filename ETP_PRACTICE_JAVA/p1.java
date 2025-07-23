public class p1 {
    public   static void main(String[] args) {
        int n=50;
        boolean[] b1=new boolean[51];
        check(n,b1);
    }
     static void check(int n,boolean[] b1){
        //  for(int i=0;i<=n;i++){
            for(int j=2;j<=Math.sqrt(n);j++){
                if(!b1[j]){
                    for(int i=j*j;i<=n;i+=j){
                        b1[i]=true;
                    }
                }
            }
            for(int i=2;i<=n;i++){
                if(!b1[i]){
                    System.out.print(i+" ");
                }
            }
        //  }
    }
}
