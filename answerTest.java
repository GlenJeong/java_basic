package java_basic;

import java.util.Arrays;

public class answerTest {

    public static void main(String[] args) {

        int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
        int[] counter = new int[4];

        // System.out.println("0~9까지 임의의 정수 출력");
        for (int i = 0; i < answer.length; i++) {
            counter[answer[i] - 1]++;

        }

        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);

            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int number = 1234321;
        int tmp = number;
        int result = 0;

        while (tmp != 0) {
            result = result * 10 + (tmp % 10);
            tmp = tmp / 10;

        }
        System.out.println(result);

        if (number == result) {
            System.out.println("회문수입니다.");
        } else {
            System.out.println("회문수가 아닙니다.");
        }

        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        for (int i = 0; i < ballArr.length; i++) {
            System.out.print("ballArr" + "[" + ballArr[i] + "] ");
            System.out.println();

        }

        System.out.println(Arrays.toString(ballArr));

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp1 = 0;

            tmp1 = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp1;

        }

        for (int i = 0; i < ballArr.length; i++) {
            System.out.print("ballArr" + "[" + ballArr[i] + "] ");

            System.out.println();
        }

        System.out.println(Arrays.toString(ballArr));

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < ball3.length; i++) {
            ball3[i] = ballArr[i];
        }

        System.out.println(Arrays.toString(ball3));

        // ball3[0]=ballArr[0];
        // ball3[1]=ballArr[1];
        // ball3[2]=ballArr[2];
        //
        // System.out.println(ball3[0]);
        // System.out.println(ball3[1]);
        // System.out.println(ball3[2]);
        // System.out.println(Arrays.toString(ball3));
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // for(int i=0; i<ball3.length; i++) {
        // System.out.print(ball3[i]);
        // }
        //
        // System.out.println(Arrays.toString(ball3));

    }
}
