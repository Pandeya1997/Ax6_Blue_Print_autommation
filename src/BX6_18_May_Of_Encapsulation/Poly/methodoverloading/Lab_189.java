package BX6_18_May_Of_Encapsulation.Poly.methodoverloading;

public class Lab_189 {
    void gift(String abhi){
        System.out.println("Abhishek is a String  " +   abhi);
    }
    int gift(int A){
        System.out.println("A is a int " + A);
   return A;
    }
    void gift (double x){
        System.out.println("double is x"+x);

   }
   int gift(float x){
       System.out.println("X is a Int" +  x);
       return 89;
   }
    void a(int pramod,float amit){

    }
    void a(float y,int x){

    }

    public static void main(String[] args) {
        Lab_189 a = new Lab_189();
        a.gift(10);
        a.gift("Abhishek");
        a.gift(1.3);
        a.gift(90);
    }

}
