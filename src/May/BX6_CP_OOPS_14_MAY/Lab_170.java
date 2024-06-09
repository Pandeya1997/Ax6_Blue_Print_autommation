package May.BX6_CP_OOPS_14_MAY;

public class Lab_170 {
    public static void main(String[] args) {
        ATBPersons objRef1 = new ATBPersons();
        ATBPersons amitRef = new ATBPersons();
        System.out.println(amitRef.name);
        ATBPersons swapnilRef = new ATBPersons();
        // Called - 2
        // Created  - 1 -> new ATB( CL)
       ATBPersons pramodRef = new ATBPersons("pramod",9876543210l);
        System.out.println(pramodRef.name);


    ATBPersons ratulRef = new ATBPersons("Ratul",1234567890l);
     System.out.println(ratulRef.name);
      System.out.println(ratulRef.phone);
    }
}
