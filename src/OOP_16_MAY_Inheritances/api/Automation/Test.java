package OOP_16_MAY_Inheritances.api.Automation;

public class Test extends  BaseTest {
    void accessExcelAndSQL(){
        openExcelFile();
        openSQLConnection();
        System.out.println(API_VERSION);
        System.out.println(VERSION);
    }

    void openJSON(){
        System.out.println("Test");
    }
}
