package BX6_18_May_Of_Encapsulation.Poly.methodoveridding;

public class Lab_190 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        Hound h = new Hound();
        h.bark();
        Dog d1 = new Hound(); // Dynamic Dispatch Runtime Polymorphism
        d1.bark();

    }
}

