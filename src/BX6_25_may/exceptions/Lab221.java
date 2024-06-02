package BX6_25_may.exceptions;

public class Lab221 {
    public static void main(String[] args) {
      try {

          String in = args[0];
          int a = Integer.parseInt(args[0]);
          int b = 10/a;
          System.out.println(b);
          System.out.println(a);
      }catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
          System.out.println("Problem with the code");
      }
      catch (Exception e){
          e.printStackTrace();
          System.out.println(e.getMessage());
      }

    }
}
