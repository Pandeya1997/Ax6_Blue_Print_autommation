package BX6_23_May;

public class Lab_207 {
    public static void main(String[] args) {
        OOC.SNIC snic = new OOC.SNIC();
        snic.show();
    }
}

class OOC{
    static int o = 10;
    int oa = 20;

    static class SNIC{
        void show(){
            System.out.println(o);
            //System.out.println(oa);
        }
    }
}