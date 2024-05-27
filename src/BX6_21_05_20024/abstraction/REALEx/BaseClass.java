package BX6_21_05_20024.abstraction.REALEx;

abstract public class BaseClass {
    // Web Automation
    // Heri Inheritance - BaseClass -> Child 1,
    // BaseClass -> Child 2

   abstract String openBrowser();
   abstract String closeBrowser();
    void printLog(){
        System.out.println("Logs");
    }
}
