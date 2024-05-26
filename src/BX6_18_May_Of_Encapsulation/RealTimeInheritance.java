package BX6_18_May_Of_Encapsulation;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1 = new Test1();
        t1.setBrowser("edge",true);
        t1.OpenBrowser();
        t1.closeBrowser();

    }
}
class Test1 extends BaseClass{
    public void setBrowser(String browser, boolean isAuth) {
        //        super.setBrowser(browser, isAuth);
        System.out.println("I am done");

    }
}
class BaseClass{
  private String Browser;
  void OpenBrowser (){
      System.out.println("Chrome_Browser !!");
  }
  void OpenBrowser (String BrowserName){
      System.out.println("openBrowser !!"+ BrowserName);
  }
  void closeBrowser (){
      System.out.println("openBrowser !!");
  }


    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
      if(isAuth){
          this.Browser = browser;
      }


    }
}
