package May.Home_Work_02_May_Arry;

public class BX6_HW_Lab007_double_an_array_and_store {
    public static void main(String[] args) {
        int[] arrays = {5, 7, 10};
        int[] arrays2 = new int[3];
        for (int i = 0; i < arrays.length; i++) {
            arrays2[i] = arrays[i] * 2;
        }
        System.out.print("Printing Arrays!!  -->" + " ");

        for (int i = 0; i < arrays2.length; i++) {
            System.out.print(arrays2[i] + " ");

        }
    }
}