package May.Home_work_04_May_2D_Array;

import java.sql.SQLOutput;

public class find_the_maximum_value_in_a_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                };
        int MAX  = arr[0][0];
        for (int i = 0; i<arr.length ; i++ ){
             for (int j=0; j<=i; j++){
              if (arr[i][j]>MAX) {
                  MAX = arr[i][j];
              }
             }

        //    System.out.print(arr[i]);
        }
        System.out.println(MAX);

    }

}
/*
int[][] arr = {

{1, 2, 3},

{4, 5, 6},

{7, 8, 9}

};
Write - Java method to find the maximum value in a 2D array. - O/P - 9
 */