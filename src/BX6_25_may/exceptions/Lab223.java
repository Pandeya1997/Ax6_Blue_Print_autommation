package BX6_25_may.exceptions;

public class Lab223 {
    public static void main(String[] args) {
      final  double pi = 3.12;
        try {
           int a = 0;
           int b = 10/a;
        }catch (Exception e){
            System.out.println("Exit");
        } finally {
            System.out.println("I am final");
        }

    }
}
