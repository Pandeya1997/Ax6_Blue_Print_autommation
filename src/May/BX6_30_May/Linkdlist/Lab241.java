package May.BX6_30_May.Linkdlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab241 {
    public static void main(String[] args) {
//        List StringList = null;
//        StringList.add("ATB");
        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(12);
        myMarks.add(241);
        myMarks.add(50);
        myMarks.add(70);
        Collections.sort(myMarks);
        System.out.println(myMarks);

    }
}
