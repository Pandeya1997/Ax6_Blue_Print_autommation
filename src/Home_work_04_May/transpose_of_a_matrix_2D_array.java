package Home_work_04_May;

public class transpose_of_a_matrix_2D_array {
  static final int N = 4;
    public static void main(String[] args) {
        /*
        Write a Java method to transpose a given 2D array.
{{1,4,7} ,
{2,5,8} ,
{3,6,9}}
out
{{1,2,3},
{4,5,6},
{7,8,9}}
         */
        int A[][] = {{1,4,7} , {2,5,8} , {3,6,9}};
        int B [][]  = new int [N][N];
       int m =0;
       int n = 0;
        for(int i = 0; i<A.length; i++){
           // System.out.print(i+",");

            for( int j = 0 ; j< A.length ; j++){

             //  System.out.print( A[i][j] + ",");
                B[m][n] = A[j][i];

                System.out.print(B[m][n] +" ");
            }

           System.out.print("\n");
        }
    }
}
