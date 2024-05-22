package BX6_CP_OOP_16_MAY_Inheritances.Oops_Single_Inheritances1;

public class Programming  {
    int version;
    String author;
    Programming(){
        System.out.println("Dc");
    }
     Programming(int version , String author){
        this.version= version;
        this.author = author;

    }

    void printInfo(){
        System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);
    }
    void bhk3(){
        System.out.println("3BHK");
    }

}
