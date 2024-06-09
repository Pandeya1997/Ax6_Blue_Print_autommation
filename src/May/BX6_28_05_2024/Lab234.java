package May.BX6_28_05_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Lab234 {
    public static void main(String[] args) {
        List <String> mylist = new ArrayList();
        mylist.add("Abhishek");
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("DUtta");
        System.out.println("-Print ---");
        for (String str :mylist){
            System.out.println(str);
        }
 for (String str : mylist ){
     System.out.println(str);
    }
        System.out.println("-- Print - 2");
 for (int i=0; i<mylist.size(); i++){
     System.out.println(mylist.get(i));
 }
        System.out.println("-Print ---3");
  // Iterator
        Iterator<String> itr =mylist.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
