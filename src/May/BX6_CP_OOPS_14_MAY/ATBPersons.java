package May.BX6_CP_OOPS_14_MAY;

public class ATBPersons {
// veriables
    // local varibles - present in the methods
    String name ;
    long  phone ;
    String email ;
    boolean isMarried;
    String  CourseName;
    //   // Constructor
    //    // default - Constructor
    ATBPersons(){
        System.out.println("default - Constructor");
        // DC
        // Special Method with no return type
        // 1 called, when you create new Object
        // It has same name as the className
        CourseName = "ATB";
        name = "abhishek";
    }

    public ATBPersons(String name) {
        this.name = name;
    }
    public ATBPersons(String name, long phone){
        this.name = name;
        this.phone = phone;
    }

    public ATBPersons(String name, long phone, String email, boolean isMarried, String courseName) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        CourseName = courseName;
    }

// void no return "empty"
    //    void printDetails() -->  just a functions,  not a constructor
    void printDetails(){
        int age = 10;
        System.out.println(age);
        System.out.println("Printing details of the student ");

    }
}
