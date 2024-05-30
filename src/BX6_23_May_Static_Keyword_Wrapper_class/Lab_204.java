package BX6_23_May_Static_Keyword_Wrapper_class;

public class Lab_204 {
    public static void main(String[] args) {
    A a = new A();
    A b = new A();
  ///  A c = null; // static class is not excuted
        //System.out.println(A.age);// non-static variable age cannot be referenced from a static context
        System.out.println(A.common);
        System.out.println(a.common);
        System.out.println(b.common);
        A.m1();
        a.m1();
        b.m1();
    //   A.m2();
       a.m2();
       b.m2();
       A d = null; // new A();
       d.m1();
       d.m2();// Instances cant accessed
    }
}
class A {
   int age= 10;
static String common = "ABC";
    static {
        System.out.println("A");
    }
    {
        System.out.println("IIB");
    }
    static void m1() {
        System.out.println("m1");
    }
    void m2 (){
        System.out.println("m2");
    }
}