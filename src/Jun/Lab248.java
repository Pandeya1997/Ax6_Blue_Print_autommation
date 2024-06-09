package Jun;

import java.util.Iterator;
import java.util.TreeSet;

import static jdk.internal.org.jline.utils.Colors.h;

public class Lab248 {
    public static void main(String[] args) {
        TreeSet numSet = new TreeSet();
        numSet.add(12);
        numSet.add(50);
        numSet.add(21);
        numSet.add(2);
        numSet.add(12);
        numSet.add(6);
      //  numSet.add("Abhi"); //java.lang.ClassCastException

        //System.out.println(numSet);
    //    System.out.println(numSet.size());
        for (Object obj : numSet){
            //    System.out.println(obj);
        }
        Iterator itr =  numSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.hasNext());
        }

    }
}
