package java_basic;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numArr = { 0, 1, 2, 3, 10, 4, 12, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(numArr));
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println();

        int tmp = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 1; j < numArr.length; j++) {

                if (numArr[i] < numArr[j]) {
                    tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                }
            }
        } // sort end

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + ", ");
        } // print end

        System.out.println();
        System.out.println();

        System.out.println(Arrays.toString(numArr));

    } // main의 끝
}
