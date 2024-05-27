package BX6_21_05_20024.Interfacekeyword;

public class Lab198 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startEngine();
        c1.applyBrake();


        // default
        c1.haltingEngineJustStart();
        c1.haltingEngineJustStop();

       // Engine.M1();
        // static method

        c1.stopEngine();
    }
}
