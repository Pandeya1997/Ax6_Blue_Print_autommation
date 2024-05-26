package BX6_18_May_Of_Encapsulation.encapsulation;

import java.security.PrivateKey;

public class Lab_191 {
    public static void main(String[] args) {
        vwoLogin v1 = new vwoLogin("admin","admin123");
       // v1.Username = "admin";
       // v1.Passwords = "admin@123";
        System.out.println(v1.Username);
    }
}
class vwoLogin{
   protected String Username;
   private String Passwords;

    public vwoLogin(String passwords, String username) {
        Passwords = passwords;
        Username = username;
    }
}