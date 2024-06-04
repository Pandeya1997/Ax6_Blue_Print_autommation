package BX6_28_05_2024;
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
    }
}
