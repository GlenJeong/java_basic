package java_basic;

import java.util.Scanner;

class MidCheck {
    int x;
    int y;
    int z;

    MidCheck() {
        this(0, 0, 0);
    }

    MidCheck(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int mid() {
        return midProcess();
    }

    int mid(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

        return midProcess();
    }

    private int midProcess() {

        int max = 0;
        int min = 0;
        int sum = 0;
        int mid = 0;

        max = x > y && x > z ? x : (y > z) ? y : z;
        min = x < y && x < z ? x : (y < z) ? y : z;
        sum = x + y + z;
        mid = sum - max - min;

        return mid;
    }

    public String print() {

        return "mid: " + mid();

    }

}

public class MidTest {
    public static void main(String[] args) {

        int[] inputNum = new int[3];
        Scanner scanner = null;

        for (int i = 0; i < 3; i++) {
            scanner = new Scanner(System.in);
            inputNum[i] = scanner.nextInt();

        }

        MidCheck m = new MidCheck(inputNum[0], inputNum[1], inputNum[2]);

        m.mid();

        System.out.println(m.print());

        scanner.close();

    }

}
