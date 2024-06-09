package May.BX6_CP_OOPS_14_MAY;

public class Lab_169 {
    public static void main(String[] args) {
        ATBPersons objRef1 = new ATBPersons();
        ATBPersons objRef2 = new ATBPersons();
        ATBPersons objRef3 = null;
        System.out.println(objRef1.CourseName);
        System.out.println(objRef1.name);
        ATBPersons amitRef = new ATBPersons();
        // objRef1.name = "Amit";
        System.out.println(amitRef.CourseName);
        System.out.println(amitRef.isMarried);
        System.out.println(amitRef.name);

// DC are created to assign the value of Instance variable of the class.
// DC -> Problem -> I can't assing my values to the Instance
        ATBPersons swapnilRef = new ATBPersons();
        System.out.println(swapnilRef.name);
        System.out.println(swapnilRef.CourseName);
    }


}
