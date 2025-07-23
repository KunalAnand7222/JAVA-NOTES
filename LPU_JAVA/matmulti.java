public class matmulti {
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};
        int b[][]={{1,2},{3,4}};
        int c[][]=new int[2][2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                int sum=0;
                for(int k=0;k<b.length;k++){
                    sum+=a[i][k]*b[k][j];

                }
                c[i][j]=sum;

            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
