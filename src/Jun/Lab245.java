package Jun;

import java.util.HashSet;
import java.util.Set;

public class Lab245 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("water Melon");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Mango");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.remove("Apple"));
        System.out.println("frutes size" +fruits.size());
        System.out.println(fruits.contains("Apple"));
       fruits.clear();
        System.out.println(fruits);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Water Melon");
        System.out.println(fruits);

    }
}
