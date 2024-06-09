package Jun;
import java.util.Map;
import java.util.HashMap;

public class Lab252 {
    public static void main(String[] args) {
        // Map - key value pair
        // API Testing - JSON - JavaScript Object Notation - Map
        // JSON - key value pair
        // HashSet and HastMap
        // name - pramod, age - 65, roll - 1, course -atb
        Map<String, Object> StudentSet  = new HashMap();
        StudentSet.put ("Name", "Abhishek" );
        StudentSet.put("Age", 27);
        StudentSet.put("Roll", 160);
        StudentSet.put("Course", "ATB");
       StudentSet.put("Last Name", "Pandey");
      //  studentMap.put("lastname", "Dutta");
        StudentSet.put("isMale", true);
        System.out.println(StudentSet);
        System.out.println(StudentSet.get("firstname"));
        System.out.println(StudentSet.get("age"));
        System.out.println(StudentSet.isEmpty());
        System.out.println(StudentSet.containsKey("age"));
        System.out.println(StudentSet.containsValue(65));
        System.out.println(StudentSet.keySet());
        System.out.println(StudentSet.values());

        for(Map.Entry<String,Object> item: StudentSet.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }






    }
}
