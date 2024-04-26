import java.util.Scanner;

public class BX6_HW_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++ ){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FiZZ Buzz");
            } else if (i % 3 == 0 ) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else
                System.out.println( i);

        }
    }
}
