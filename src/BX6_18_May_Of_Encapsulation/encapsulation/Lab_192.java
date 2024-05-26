package BX6_18_May_Of_Encapsulation.encapsulation;

public class Lab_192 {
    public static void main(String[] args) {
        vwoLogin1 v1 = new vwoLogin1("admin","admin123");
        //v1.username = "admin";
        String username = v1.getUsername();
        // Code to Auth  isAuth = true
        // String password = v1.getPassword(false);
        v1.setPasswords("pramod",true);

    }
}
class vwoLogin1{
  private   String Username;
    private String Passwords;

    public vwoLogin1(String username, String passwords) {
        this.Username = username;
      this.Passwords = passwords;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPasswords(boolean isAuth) {
        if(isAuth) {
            return Passwords;
        }
        else {
            return "Not Allowed";
        }
    }

    public void setPasswords(String passwords, boolean isAuth) {
if(isAuth){
    this.Passwords = passwords;
}else
    System.out.println("Not Allowed");

    }
}