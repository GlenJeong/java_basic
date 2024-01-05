package java_basic;

import java.util.*;

public class TreeSetRangeTest {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        int[] numRange = new int[10];

        for (int i = 0; i < numRange.length; i++) {
            int num = (int) (Math.random() * 100) + 1;
            numRange[i] = num;
            set.add(numRange[i]);
        }
        System.out.println(Arrays.toString(numRange));
        System.out.println(set);

        System.out.println("50보다 작은 값은: " + set.headSet(50));
        System.out.println("50보다 큰 값: " + set.tailSet(50));
        System.out.println("50에서 가장 가까운 큰 값: " + set.higher(50));
        System.out.println("50에서 가장 가까운 작은 값: " + set.lower(50));
        System.out.println("TreeSet에 들어있는 첫 번째 값: " + set.first());
        System.out.println("TreeSet에 들어있는 마지막 값: " + set.last());
        System.out.println("50이 있다면 50반환, 없다면 가장 가까운 높은 값을 반환: " + set.ceiling(50));
        System.out.println("50이 있다면 50반환, 없다면 가장 가까운 낮은 값을 반환: " + set.floor(50));
        System.out.println("20에서 50사이 값을 반환: " + set.subSet(20, 50));
    }
}
