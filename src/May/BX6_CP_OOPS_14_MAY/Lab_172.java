package May.BX6_CP_OOPS_14_MAY;

public class Lab_172 {
    public static void main(String[] args) {
        BankAccount  sbi_ref = new BankAccount();
        sbi_ref.printDetails();

        BankAccount hdfc_ref = new BankAccount(10,"HDFC001","HDFC");
        hdfc_ref.printDetails();


        BankAccount yesbank_ref = new BankAccount("YES bANK","YES005");
        yesbank_ref.printDetails();



        BankAccount icici_ref = new BankAccount(20,"icici003","ICIC");
        icici_ref.printDetails();


    }
}
