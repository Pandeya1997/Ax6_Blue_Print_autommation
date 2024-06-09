package May.Home_work_04_May_2D_Array;

import java.util.concurrent.ForkJoinPool;

public class Java_method_to_transpose_a_given_2D_array {
    /*
    Write a Java method to transpose a given 2D array.
{{1,4,7},
{2,5,8},
{3,6,9}}
 {{1,2,3},
 {4,5,6},
 {7,8,9}}
     */
   // static final int N = 3;
    public static void main(String[] args) {
        int A [][] = {{1,4,7}, {2,5,8}, {3,6,9}};
        int B[][] = new int[3][3] , i, j;


        for ( i = 0; i<A.length ; i++) {
           // System.out.print(i +", ");
            int k =0;
            int m = 0;
            for ( j = 0 ; j<A[i].length; j++){
             //  System.out.print(A[i][j]);
               B[i][j] =A[j][i];
               System.out.print(B[i][j]);
            }
            System.out.print("\n");



        }

    }
}
