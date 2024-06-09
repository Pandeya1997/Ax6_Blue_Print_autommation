package May.BX6_CP_OOPS_14_MAY;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    BankAccount(){
        bankName = "SBI";
        bankCode = "SBI001";
        balance= 0;
    }
   void   printDetails() {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }
    BankAccount(int balance, String bankCode,String bankName) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }


    BankAccount(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

}
