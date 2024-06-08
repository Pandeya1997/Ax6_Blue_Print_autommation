package May.BX6_30_May;
import java.util.ArrayList;
import java.util.List;
public class Lab238 {
    public static void main(String[] args) {
        // List - ArrayList, LinkedList, Vector,Stack
        // Set - HashSet, LinkedHashSet, TreeSet
        // Map - HashMap, LinkedHashMap, TreeMap
        // Queue - PriorityQueue, LinkedList
        // Hashtable, Properties
        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET Blueprint");

        List numList = new ArrayList();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courseList.addAll(numList);
        System.out.println(courseList);
    }
}
