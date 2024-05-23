package OOP_16_MAY_Inheritances;

import OOP_16_MAY_Inheritances.api.Automation.BaseTest;

public class Test2  extends BaseTest {
    void acc(){
        openExcelFile();
        openSQLConnection();
    }
}
