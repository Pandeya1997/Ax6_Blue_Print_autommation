package May.BX6_23_May_Static_Keyword_Wrapper_class;

public class Lab201 {
    // Static
    // Data member
    // Function
    // Class

    // Static loads when Class is loaded
    public static void main(String[] args) {
//        ATB amit = new ATB("  989882323");
//        ATB Pramod = new ATB("  +1222233323");
//        amit.printDetails();
//        Pramod.printDetails();
//        System.out.println(ATB.CourseName);
        ATB ashok = new ATB("939383920");
        ATB ashok2 = new ATB("939383920");

    }
}

class   ATB{
    static {
        System.out.println("SIB - Load one Time, Class IS LOADED");
    }
    {
        System.out.println("IIB - instance initialization block. Loaded when Object is created");
    }
static String CourseName = "ATB"; // Static Variab
String phoneNo;// Non static , Instance Variable
public ATB (String phoneNo){
    this.phoneNo = phoneNo;

}
public void  printDetails(){
    System.out.println("Your Print Details" + this.phoneNo);
}
}