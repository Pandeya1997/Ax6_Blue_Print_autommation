package May.OOP_16_MAY_Inheritances.Multi_Level_Inheritances;

public class Lab_176 {
    public static void main(String[] args) {
        Child c = new Child();
        c.home();
        GrandFather grandFather = new GrandFather();
        grandFather.home();
        Father father = new Father();
        father.home();

        // Dynamic Dispatch
        //
        GrandFather grandFather1 = new GrandFather();
        GrandFather grandFather2 = new Father();
        GrandFather grandFather3 = new Child();

        Father f1 = new Child();
        f1.home();

//        Child c1 = new GrandFather();
//        Father c2 = new GrandFather();
    }
}
