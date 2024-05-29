package BX6_21_05_20024.StaticKeywords;

public class Lab201 {
    // Static
    // Data member
    // Function
    // Class

    // Static loads when Class is loaded. -

}
class ATB {

    static {
        System.out.println("SIB - Load one Time, Class IS LOADED");
    }

    {
        System.out.println("IIB - instance initialization block. Loaded when Object is created");
    }


    static String courseName = "ATB"; // Static Variable
    String phoneNo; // Non static , Instance Variab