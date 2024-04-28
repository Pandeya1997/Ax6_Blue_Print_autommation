import java.nio.charset.Charset;
import java.text.BreakIterator;
import java.util.Scanner;

public class BX6_HW_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number_1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number_2");
        int num2 = sc.nextInt();
        System.out.println("Enter Operation +,-,%,/,*");
       char Operation = sc.next().charAt(0);
       switch (Operation)
       {
           case '+' :
               System.out.println("Result " + (num1 + num2));
               break;
           case  '-' :
               System.out.println("Result" + ( num1 -num2 ));
               break;
               case '/' :
               System.out.println("Result " + (num1 / num2));
               break;
           case  '*' :
               System.out.println("Result" + ( num1 * num2 ));
               break;
               case  '%' :
               System.out.println("Result" + ( num1 % num2 ));
               break;
           default:
               System.out.println("Invalid operation Performs");



       }
       sc.close();

    }
}
