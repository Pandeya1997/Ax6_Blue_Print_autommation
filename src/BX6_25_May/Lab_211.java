package BX6_25_May;

import org.w3c.dom.ls.LSOutput;

public class Lab_211 {
    public static void main(String[] args) {
        int x = 123;
        // String s1 = x;
        // String s1 = (String)x;
        String s1 = String.valueOf(x);
        System.out.println(s1);
        Character ch = 'a';
        char a3 = 'A';
        char a4 = ch;
        Boolean b = true;
        Long l = 34l;
        Double d1 = 90.0;
        Float f1 = 90.89f;
        // Wrapper class is used to convert primitive
        // data types into objects.
        Integer integer = Integer.valueOf(5);
        System.out.println("intobject ");
        Integer a2 = 89;
        // autoBoxing (Primitve --> wrapper (Automatically))
        System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.max(4,5));
    System.out.println(Integer.min(1,34));
        //Integer a11 = new Integer(10); JDK 9 it is removed
        Integer a12 = Integer.valueOf(10);


    }
    }

