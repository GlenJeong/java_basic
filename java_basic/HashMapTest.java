package java_basic;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        System.out.println("map.isEmpty() : " + map.isEmpty());

        map.put("신논현", 1);
        map.put("강남", 2);
        map.put("혜화", 3);
        map.put("안양", 4);
        map.put("수원", 5);

        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        map2.put("천안", 6);
        map2.put("양평", 7);
        map2.put("장성", 8);
        map2.put("파주", 9);
        map2.put("부산", 10);

        System.out.println("map : " + map);
        System.out.println("map2 : " + map2);
        map.putAll(map2);
        System.out.println("map.putAll(map2) : " + map);
        map2.putAll(map);
        System.out.println("map2.putAll(map) : " + map2);

        // System.out.println(map.replace("천안", 112));
        System.out.println(map);
        System.out.println(map.replace("천안", 6, 112));
        System.out.println("천안, 6, 112 => " + map);
        System.out.println(map.replace("부산", 11, 111));
        System.out.println("부산, 11, 111 =>" + map);

        System.out.println(map.size());
        System.out.println(map.values());

        System.out.println(map.get("천안"));

        int result1 = map.getOrDefault("천안", 1234);
        System.out.println(result1);
        int result2 = map.getOrDefault("제천", 1234);
        System.out.println(result2);

        System.out.println(map.containsKey("천안"));
        System.out.println(map.containsKey("제천"));

        System.out.println(map.containsValue(112));
        System.out.println(map.containsValue(1234));

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        System.out.println(map);
        System.out.println(map2);

        System.out.println(map.clone());

        HashMap<String, Integer> map5 = new HashMap<String, Integer>();
        map5.put("제천", 1);
        map5.put("봉양", 2);
        map5.put("송한", 3);
        map5.put("송한", 4);
        map5.put("입석", 5);
        System.out.println("map5: " + map5);
        HashMap<String, Integer> map4 = new HashMap<>();
        System.out.println("map4: " + map4);
        map4 = (HashMap<String, Integer>) map5.clone();
        System.out.println("map5를 map4에 복사: " + map4);

    }
}
