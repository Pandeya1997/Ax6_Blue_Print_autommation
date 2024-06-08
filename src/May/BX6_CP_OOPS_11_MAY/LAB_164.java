package May.BX6_CP_OOPS_11_MAY;

public class LAB_164 {
    public static void main(String[] args) {

        Car tesla = new Car();
        tesla.name = "Tesla";
        tesla.model = "Model 3";

        System.out.println(tesla.name+tesla.model);
        tesla.reverse();

        tesla.speedTop();

        Car volvo = new Car();
        volvo.name = "Volvo";
        volvo.model = "XC90";

        volvo.reverse();
        volvo.speedTop();



    }
}
