package BX6_18_May_Of_Encapsulation;

public class Lab_185 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        // Constructor chaining --> child DC --> Parent's DC
    }
}
class Animal{
     String type ;
     Animal(){
        System.out.println("Animal DC");
    }
    Animal(String type){
        System.out.println("Animal PC");
    }

}
class Dog extends  Animal{
    String breed;
     Dog(){
        System.out.println("Dog DC");
    }

    public Dog(String breed) {
    this.breed = breed;
    }
    void display(){
        System.out.println("Type : " + super.type + "Breed: " +this.breed);
    }
}