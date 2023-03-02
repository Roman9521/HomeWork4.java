package online.collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Roman Efremov");
        map1.put(2000, "Ivan Ivanov");
        map1.put(3000, "Mariya Sidorova");
        map1.put(4000, "Nikolay Petrov");
        map1.put(2523, "Nikolay Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov");

        System.out.println(map1);
        System.out.println(map1.get(1000));
//        System.out.println(map1.get(152345));
        map1.remove(2523);
//        System.out.println(map1.containsValue("Ivan Ivanov"));
//        System.out.println(map1.containsKey(2000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        String s = "mamamamama";
        String f = "mamamamama";
        System.out.println(s.equals(f));
    }
}
