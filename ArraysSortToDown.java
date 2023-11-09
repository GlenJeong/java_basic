package java_basic;

import java.util.Arrays;

public class ArraysSortToDown {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            int numRan = (int) (Math.random() * 10) + 1;
            array[i] = numRan;
        }

        System.out.println(Arrays.toString(array));

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

}
