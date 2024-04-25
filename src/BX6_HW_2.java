public class BX6_HW_2 {
    // leap year program find
    public static void main(String[] args) {
    int flag = 0;
        int num = 21 ;
        if ((num == 1 || num <= 1 )  ){
            System.out.println("number is not prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0)  { System.out.println(num+" is prime number"); }

    }

}
