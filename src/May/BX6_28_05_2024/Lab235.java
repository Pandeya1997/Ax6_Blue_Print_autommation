package May.BX6_28_05_2024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab235 {
    public static void main(String[] args) {
        ArrayList myList1 = new ArrayList();// cr --> co
       List myList = new ArrayList(); //FR --> CO
        SequencedCollection mylist2 = new ArrayList(); // GF --> CO
     Collection myList3 = new ArrayList(); // GGF --> CO
     // ArrayList
     // Size is dyamic
    // Duplicate is allowed
    // Insertion order is Preserved
    // Null instruction is Possible

    myList.add("Abhishek");
    myList.add("anushka");
    myList.add("swati");
    myList.add("shubh");
        System.out.println(myList);
        // Abhishek , anusha, swati ;
        myList.add("Abhishek");
        myList.add("Abhishek");
        myList.add("Abhishek");
        myList.add("Abhishek");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.remove("Abhishek");
        System.out.println(myList);

    }
}
