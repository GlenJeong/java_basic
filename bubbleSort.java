package java_basic;

import java.util.*;;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 4, 8, 1, 5, 2, 7 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp = 0;

                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
}
