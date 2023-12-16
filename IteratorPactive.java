package java_basic;

import java.util.*;

public class IteratorPactive {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();

        System.out.println(it.hasNext());

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println(it.hasNext());

    }
}
