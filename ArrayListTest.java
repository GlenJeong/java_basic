package java_basic;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
        print(list1, list2);

        // Collectiondms 인터페이스이고 Collections은 유틸 클래스
        Collections.sort(list1); // 정렬
        Collections.sort(list2); // 정렬

        System.out.println("오름 차순으로 정렬 후 출력 : ");
        print(list1, list2);

        // list1에서 list2가 포함되어 있으면 true 아니면 false
        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

        list2.add(7);
        list2.add(8);
        // 인덱스 3에 9를 추가
        list2.add(3, 9);
        print(list1, list2);

        list2.set(3, 11);
        print(list1, list2);

        list1.add(0, 1);
        print(list1, list2);

        System.out.println(list1.containsAll(list2));

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        // list1에서 숫자 3의 인덱스 위치를 확인
        System.out.println("index = " + list1.indexOf(3));

        System.out.println("인덱스 1를 지우기전 : " + list1);
        list1.remove(1);
        System.out.println("인덱스 1를 지운 후 : " + list1);
        System.out.println();

        // list1에서 list2 겹치는 것 빼고 삭제 list1 출력
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        System.out.println("list2에서 list1의 동일한 객체 삭제하기 ");
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    private static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}