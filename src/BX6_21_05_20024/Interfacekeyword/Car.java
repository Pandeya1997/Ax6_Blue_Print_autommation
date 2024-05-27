package BX6_21_05_20024.Interfacekeyword;

public class Car implements Brake,Engine{
    ;

    @Override
    public void applyBrake() {
        System.out.println("Applying Brake");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stopping Engine");
    }
}
