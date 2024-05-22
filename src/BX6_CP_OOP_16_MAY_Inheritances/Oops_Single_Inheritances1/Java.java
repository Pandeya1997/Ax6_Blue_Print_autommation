package BX6_CP_OOP_16_MAY_Inheritances.Oops_Single_Inheritances1;

public class Java extends Programming {
    // Single inheritance --is A
    // Java is a Programing Lang
    // Python is a Programing
 String newFeature;
    //    int version;
//    String author;
    public Java() {
        System.out.println("DC");
    }

    public Java(String newFeature) {
        this.newFeature = newFeature;
    }
 void printinfo(){
     System.out.println("newFeature is --> " + this.newFeature);
     bhk3();
    }

}
