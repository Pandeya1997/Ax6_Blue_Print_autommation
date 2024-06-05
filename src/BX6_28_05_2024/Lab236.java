package BX6_28_05_2024;

import java.util.*;

public class Lab236 {
    public static void main(String[] args) {
    //    ArrayList myList1 = new ArrayList();// cr --> co
        //  SequencedCollection mylist2 = new ArrayList(); // GF --> CO

        List myList = new ArrayList(); //FR --> CO
        myList.add("Abhishek");
        myList.add("anushka");
        myList.add("swati");
        myList.add("shubh");
        System.out.println(myList);

     // Vector --> thried safe
        Vector v = new Vector();
        v.add("Abhishek");
        v.add("anushka");
        v.add("swati");
        v.add("reena");
        v.remove("reena");
        // can you guess the o/p
        System.out.println(v);




    }
}
