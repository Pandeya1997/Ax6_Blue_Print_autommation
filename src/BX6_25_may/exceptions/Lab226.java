package BX6_25_may.exceptions;

public class Lab226 {

    public static void main(String[] args) {

        try {
            int a = 10/0; //UnChecked - JVM don't know?
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
