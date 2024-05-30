import java.util.Scanner;

public class BX6_HW_1 {
    public static void main(String[] args) {

        //Program to Check if a Number is Positive, Negative, or Zero.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num = sc.nextInt();
        if(num<0){
            System.out.println(" Number is Negative  --> " +  num);
        } else if (num>0){
            System.out.println(" Number is Postive --> " +  num);
        } else
            System.out.println(" Number is zero --> " +   num);

        */
        // Program to Find the Largest Among Three Numbers:
       /*
        int n1= 20;
        int n2 = -223;
        int n3 = 43;
        if(n1>n2 && n1>n3){
            System.out.println("your Largest number -->" + n1);
        } else if (n2>n3 && n2>n1 ) {
            System.out.println("Your largest number -->" +  n2);
        }else{
            System.out.println("Your largest number -->" +  n3);
        }

        */
         /*
        // Program to Check if a Character is a Vowel or a Consonant

        Scanner sc = new Scanner(System.in);
       System.out.println("Enter your Later");
        char chr = sc.next().charAt(0);
         char ch = Character.toLowerCase(chr);
        //   char   ch =  'A';
        char a = 0;
        char e = 0;
        char i = 0;
        char o = 0;
        char u = 0;
        char A = 0;
        char I = 0;
        char E = 0;
        char O = 0;
        char U = 0;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
          */

        /*
        Program to Check if a Year is a Leap Year or Not: 2024
         */

         int year = 8000;
         if((year%4 == 0) && (year % 400 == 0) ||  (year % 100 != 0 )){
             System.out.println("wellcome You are present leap in year ");
         } else
             System.out.println("you are not present in leap year");
    }


}
