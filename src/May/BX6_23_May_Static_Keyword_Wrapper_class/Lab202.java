package May.BX6_23_May_Static_Keyword_Wrapper_class;

public class Lab202 {
    public static void main(String[] args) {
   Person p1 = new Person("Amit");
   Person p2 = new Person("Pramod");
        System.out.println(Person.footballClub);
        // static
        // className fun
      Person.m1();
      p1.m1();
      p2.m1();

      Person.footballClub= "Menu";
        System.out.println(p1.footballClub);
        System.out.println(p2.footballClub);


        p1.name = "LUX";
        System.out.println(p2.name);
        // Non-static -Ref
     p1.m2();
        p1.m2();

    }
}

class Person{
 static   String footballClub= "Arsemal";
    {
        System.out.println("IIB");
    }
    static {
              System.out.println("Once, When class is loaded");
    }
    String name; // non-static
    // static f(n)
   static  void m1(){
       System.out.println("I am Common F(n)");
   }
   void m2(){
       System.out.println("Person --> "+ this.name);
   }

    public Person(String name) {
        this.name = name;
    }
}