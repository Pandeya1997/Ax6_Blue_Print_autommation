package Jun;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab246 {
    public static void main(String[] args) {
        Set courseSets = new HashSet<>();
        courseSets.add("ATB");
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");
      //  System.out.println(courseSets);
      //  System.out.println(courseSets.size());

        for(Object obj :courseSets){
            System.out.println(obj);
        }
        Iterator it = courseSets.iterator();
        while (it.hasNext()){
            System.out.println(it.hasNext());
        }
    }
}
