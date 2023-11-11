package java_basic;

import java.util.Arrays;

public class CountTheNumberInArray {
    public static void main(String[] args) {

        int[] number = new int[10];
        int[] counter = new int[number.length];

        for (int i = 0; i < number.length; i++) {
            int numRan = (int) (Math.random() * 10);
            number[i] = numRan;
            System.out.print("[" + number[i] + "]" + " ");
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < number.length; i++) {
            counter[number[i]]++;
        }

        for (int i = 0; i < counter.length; i++) {
            System.err.println("배열 [" + i + "]의 갯수 " + counter[i] + " ");
        }
    }

}
