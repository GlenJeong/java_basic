package java_basic;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println(setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println(setB);

        setA.removeAll(setB);
        System.out.println("setA.removeAll(setB) A와 B의 차집합 = " + setA);

        // [1, 2, 3, 4, 5]
        // [4, 5, 6, 7, 8]
        // setA.removeAll(setB) A와 B의 차집합 = [1, 2, 3]

    }
}
