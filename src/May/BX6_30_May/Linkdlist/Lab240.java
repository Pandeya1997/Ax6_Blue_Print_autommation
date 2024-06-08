package May.BX6_30_May.Linkdlist;

import java.util.*;

public class Lab240 {
    public static void main(String[] args) {
        List ttacourseList = new LinkedList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPTI");
        ttacourseList.add("SDET,Blueprint");
        ttacourseList.add("Java for Tester");
        System.out.println(ttacourseList);


        Vector<String> v2 = new Vector<>();
        v2.add("ATB");
        v2.add("MTB");
        v2.add("LAPTI");
        v2.add("SDET");
        v2.add("SDET2");
        v2.add("Manager");
        Enumeration e = v2.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
