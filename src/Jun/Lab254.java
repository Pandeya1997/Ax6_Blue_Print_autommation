package Jun;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Lab254 {
    public static void main(String[] args) {
 Map <String, String> map = new HashMap();
 map.put("Frist Name", "Abhishek");
 map.put("Last Name", "Pandey");
 map.put("email", "abhishekpy55@gmail.com");
 map.put("phone", "8448172617");
 map.put("City", "Noida");
map.put("state", "Utter Pradesh");
map.put("Country", "India");
map.put("Zip","201301");
//System.out.println(map);

Map<String,String> Map1 = new HashMap();
Map1.put("Frist Name", "Amit");
Map1.put("Last Name", "Pandey");
Map1.put("email", "Amit@gmail.com");
Map1.put("phone", "9452636502");
Map1.put("City", "Noida");
Map1.put("state", "Utter Pradesh");
Map1.put("Country", "India");
Map1.put("Zip", "201301");
//System.out.println(Map1);
//System.out.println(map.equals(Map1));
ArrayList list = new ArrayList();
list.add(map);
list.add(Map1);
System.out.println(list);
System.out.println(list.get(0));
System.out.println(list.get(1));

    }
}
