package BX6_25_may.exceptions;

public class Lab_219 {
    public static void main(String[] args) {
        String sh = args[0];
        int x = Integer.parseInt(sh);
        int a = 10/x;
        System.out.println(x);
        System.out.println(a);
        // Tc1- 5
        // Test case for the program
        // -=> 5 - Happy
        // No Input - java.lang.ArrayIndexOutOfBoundsException
        // 0 - java.lang.ArithmeticException
        // -5
        // pramod - java.lang.NumberFormatException
        // 3.45 - java.lang.NumberFormatException
        // @@#$%^&^%$#% - java.lang.NumberFormatException



        // NumberFormatException
        // ArrayIndexOutOfBoundsException
        // ArithmeticException

    }
}
