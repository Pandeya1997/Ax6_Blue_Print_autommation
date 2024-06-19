package JUN1.BX6_18_Jun_RestAssured;

public class BP {
    BP Step1(){
        System.out.println("Step 1");
      return this;
    } BP Step2(){
        System.out.println("Step 2");
      return this;
    } BP Step3(){
        System.out.println("Step 3");
      return this;
    }

    public static void main(String[] args) {
        BP bp = new BP();
        bp.Step1().Step2().Step3();

    }
}
