package BX6_25_may.exceptions;

import java.io.FileInputStream;

public class Lab_220 {
    public static void main(String[] args) {
        // Exception

        // Checked - JVM knows -
        // Compile Time -/JVM? If Knows about it, - Checked Exception
        // FileInputStream f = new FileInputStream("C:/log.txt");
        // File io - open
        try {
            FileInputStream f = new FileInputStream("c:/loh.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        // Unchecked - JVM Knows
        int a = 10;
        int c = a/0;
        System.out.println(c);

        String s1 = null;
        s1.trim();
    }
}
