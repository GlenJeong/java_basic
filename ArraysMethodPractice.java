package java_basic;

import java.util.*;

public class ArraysMethodPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        int[] arr = { 0, 1, 2, 3, 4 };
        int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("arr2 = " + Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr, 3);
        System.err.println("arr3 = " + Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOf(arr, 7);
        System.out.println("arr4 = " + Arrays.toString(arr4));

        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("arr5 = " + Arrays.toString(arr5));

        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
        System.out.println("arr6 = " + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int) (Math.random() * 5) + 1);
        System.out.println("arr7(Random) = " + Arrays.toString(arr7));

        // for (int x = 0; x < arr7.length; x++) {
        // int i = arr7[x];
        for (int i : arr7) { // 향상된 for문, arr7 배열에서 순서대로 꺼내서 넣는다. 첫 번째 요소부터 i에 넣는 다.
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }

        String[][] str2D = new String[][] { { "aaa", "bbb", "ccc" }, { "AAA", "BBB", "CCC" } };
        String[][] str2D2 = new String[][] { { "aaa", "bbb", "ccc" }, { "AAA", "BBB", "CCC" } };

        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D, str2D2));

<<<<<<< HEAD
        System.out.println("=========");
        for (String[] str2DArr : str2D) {
            for (String strArr : str2DArr) {
                System.out.println(strArr);
            }
        }
        System.out.println("=========");

=======
>>>>>>> 31a3a38f6453fa1ce7257149996c25a01673c600
        char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
        System.out.println("= After sort = ");
        Arrays.sort(chArr);
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));

    }
}
