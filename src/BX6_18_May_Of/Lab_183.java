package BX6_18_May_Of;

public class Lab_183 {
    public static void main(String[] args) {
       // Student1 sc1 = new Student1();
        // If child has DC -> PC DC will be called by
        // super() automatically in Java
       Person1 pc1 = new Person1();

       // super.variable
        // super.method()
        // super() -> DC
        // super("pramod') -> PC

    }
}
class Person1  {
    Person1(){
        System.out.println("Person1-Dc");
    }
    Person1(String a){
        System.out.println("Person1 - PC");
    }
    Person1(String a, int a1){
        System.out.println("Person1 - pc");
    }
}
class Student1 extends Person1 {
    Student1(){
     //  super();// default constructor
      //  super("a");
        super("Abhi", 7);
        System.out.println("Student1 - DC");

    }
}