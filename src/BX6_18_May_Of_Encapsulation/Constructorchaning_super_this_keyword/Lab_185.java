package BX6_18_May_Of_Encapsulation.Constructorchaning_super_this_keyword;

public class Lab_185 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("LAB");
        d2.display();
        Dog d3 = new Dog("GOlden Retriever", "DOG TT");
        d3.display();
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
    int a;
     Dog(){
        System.out.println("Dog DC");
    }
    public Dog (String breed){
        // super("dog Type");
       this.breed= breed;
    }
  Dog (String breed, String type){
        // super(type);
      this("Breed set by only");
       this.type= type;
        System.out.println("PC with two ARG");
    }
    Dog (String breed, String type,int a){
         this("Breed set by Dog only", "Golder R");
       this.a= a ;
        System.out.println("PC with two ARG");
    }
    void display(){
        System.out.println("Type : " + type + "Breed: " + breed);
    }
}


