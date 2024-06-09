package Jun;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
public class Lab249 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(123456);
        integerSet.add(12345);
        integerSet.add(1234);
        integerSet.add(123);
        integerSet.add(12);
        integerSet.add(null);
        System.out.println(integerSet);


        Set<Integer> integerSet2 = new LinkedHashSet<>();
        integerSet2.add(123456);
        integerSet2.add(12345);
        integerSet2.add(1234);
        integerSet2.add(12);
        integerSet2.add(123);
        integerSet2.add(null);
        System.out.println(integerSet2);
Set integersSet3 = new TreeSet<>();
       // integersSet3.add(11);
     //   integersSet3.add(8); //  lang.ClassCastException
        integersSet3.add("Abhi");
        integersSet3.add("Pandey");
         integersSet3.add("Manju");
        integersSet3.add("shital");
     //   integersSet3.add(13);
    //    integersSet3.add(null);  // java.lang.NullPointerException
        System.out.println(integersSet3);

    }
}
