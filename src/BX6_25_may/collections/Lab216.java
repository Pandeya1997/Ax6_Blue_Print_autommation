package BX6_25_may.collections;

public class Lab216 {
    public static void main(String[] args) {
        APIENDPOINT e = APIENDPOINT.Login;
        switch (e){
            case Login -> System.out.println("Login Page code should be executed");
            case DashBoard -> System.out.println("Dashboard Page code should be executed");
        }
    }
}
