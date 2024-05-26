package BX6_18_May_Of_Encapsulation.encapsulation;

public class Lab_193 {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank("Abhishek" , 123);
        i.setBal(-100);
     //   i.getName("Amit");
      //  i.name = "Admin";
        System.out.println(i.getBal());


   }
}



