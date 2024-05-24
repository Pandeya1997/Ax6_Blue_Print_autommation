package BX6_18_May_Of_Encapsulation;

public class Lab_182 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.messages();
        s1.display();
    }
}
class student extends Person{
    // is a relation --> Inheritance
    void messages (){
        System.out.println("I am Student messages");
    }
    void display (){
        this.messages();// same class function or method  used
        super.messages(); // Parent class function or method use
    }
}
class Person{
   void messages(){
       System.out.println("I am Person messages");
   }
}