package BX6_18_May_Of_Encapsulation;

public class Lab_181 {
    public static void main(String[] args) {
        // Super keyword in Java
        // parent -> child
        // Super keyword reference to parent class
        // Variable of Parent.
        // Method of the parent.
        // Constructor of the parent.
        car c = new car();
        int speed = c.maxSpeed;
        System.out.println(speed);
        c.display();
    }
}
        class car extends Vehicle {
            // Single Inheritances
           int maxSpeed = 180;

            void display() {

                System.out.println("Max Speed of car can be" + super.maxSpeed);
                System.out.println("Max Speed of car can be" + this.maxSpeed);
                // super key used --> Parent class variable use or invoked
                // This key used --> Same class variable use or invoked
            }
        }

        class Vehicle {
            int maxSpeed = 100; // Instances Variable

            void messages() {
                // No return type method and Functions
                System.out.println("This is vehicle class ");

            }
        }


