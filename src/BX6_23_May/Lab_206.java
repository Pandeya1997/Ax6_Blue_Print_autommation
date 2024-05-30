package BX6_23_May;

public class Lab_206 {
    private static Car.Engine engine;

    public static void main(String[] args) {
        Car c = new Car("Lambo");
        c.driver();
        Car.Engine engine = c.new Engine("400CC");
        engine.start();
        c.driver();

        // Nested class - To shield the inner class
    }
}
class Car{
    String make;

    public Car(String make) {
        this.make = make;
    }
    // method
    void driver(){
        System.out.println("you can derive car");
    }
    class Engine{
        // instance variable
        String hoursePowser;
        public Engine(String hoursePowser){
            this.hoursePowser = hoursePowser;
        }
        // Method
        void start(){
            System.out.println("Enginer is started !! -->" + make);
        }
        class GearBox{
            void  m2(){
                System.out.println("m2");
            }
            class PP {
                class oo{
                }
            }
        }
    }
}