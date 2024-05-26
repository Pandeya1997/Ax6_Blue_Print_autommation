package BX6_18_May_Of_Encapsulation.AccessModifiers.Criminal;

import BX6_18_May_Of_Encapsulation.AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        cop.canIShoot();
    }
}
