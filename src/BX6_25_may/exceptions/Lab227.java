package BX6_25_may.exceptions;

public class Lab227 {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank jpmorgan = new Bank("USD",10);
        Integer total = sbi.add(jpmorgan);
        System.out.println(total);

    }
}
