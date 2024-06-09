package May.BX6_CP_OOPS_14_MAY;

public class Lab_167 {
    public static void main(String[] args) {
        ATBPersons atbPersons1 = new ATBPersons();
        // Class Name objectRef  = new keywords + className();
        // ClassName objectRef =  new keyword + ClassName();
        // Object -> new keyword + className();
        // Object Ref -> objectRef
        // ATBPerson atbPerson1 = ATBPerson(); (calling of function)
        System.out.println(atbPersons1.name);
        atbPersons1.name = "Amit";
        System.out.println(atbPersons1.name);
    }
}
