package BX6_28_05_2024;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
public class Lab232 {
    public static void main(String[] args) {
        // List mylist1 = new List();
        // List is an interface , can you create object of List interface?
        // List mylist2 = new ArrayList();
        // List is an interface , can you create object of ArrayList class?
        List mylist = new ArrayList();
        ArrayList mylist1 = new ArrayList();
        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll
         mylist.add("Abhishek ");
         mylist.add("Abhay");
         mylist.add("pravesh");
         mylist.add("sweta");
         mylist.add("Abhishek");
         mylist.add("Abhishek"); // Duplicate Allowed
        System.out.println(mylist);
        System.out.println(mylist.size());

        mylist.remove("Abhishek");
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.clear();
        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.isEmpty());
        System.out.println("----------------");
        mylist.add("Abhishek ");
        mylist.add("Abhay");
        mylist.add("pravesh");
        mylist.add("sweta");
        mylist.add("Abhishek");
        mylist.add("Abhishek"); // Duplicate Allowed
        System.out.println(mylist);
        //System.out.println(mylist.size());
        mylist.set(1,"Abhay kumar Ydev");
        System.out.println(mylist);
        mylist.add("pandey");
        mylist.add(844817);
        mylist.add(true);

        System.out.println(mylist);
    // How to print ?
    //  [Abhishek , Abhay kumar Ydev, pravesh, sweta, Abhishek, Abhishek, pandey, 844817, true ]

        for (int i = 0; i<mylist.size() ; i++) {
            System.out.println(mylist.get(i));
        }
        System.out.println("??????????????????????????????????");
        // For each loop
        for (Object obj : mylist){
           System.out.println(obj);
        }
    }
}
