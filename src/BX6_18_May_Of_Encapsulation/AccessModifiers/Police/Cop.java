package BX6_18_May_Of_Encapsulation.AccessModifiers.Police;

public class Cop {
public int gun; // public access by anyone
private  String idCard ;//Private - only available to the cop
    public Cop(int gun){
        this.gun = gun; // PC
    }

    public void  canIShoot(){
        System.out.println("Of-course, Shoot!");
    }


}
