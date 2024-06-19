package JUN1.BX6_18_Jun_RestAssured;

public class BuilderPatternDesignPatternJava {

    public BuilderPatternDesignPatternJava groundfloor() {
        System.out.println("Do some task of groundfloor");
        return this;
    }
    public BuilderPatternDesignPatternJava firstfloor(String name){
        System.out.println("Do some task of firstfloor" + name);
        return this;
    } public BuilderPatternDesignPatternJava Secondfloor(String name, String color){
        System.out.println("Do some task of Secondfloor" + name+color);
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
        bp.groundfloor().firstfloor("F F").Secondfloor("SF","RED");
        // Rest Assured
        // get().header().auth().make().response().verify()
    }
}
