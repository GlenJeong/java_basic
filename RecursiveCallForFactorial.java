package java_basic;

/**
 * Factorial
 * 
 * int number;
 */
class Factorial {
    int number;

    public int number(int num) {
        int result = 0;
        if (num == 1) {
            result = 1;
        } else {
            result = num * number(num - 1);
        }
        return result;
    }
}

public class RecursiveCallForFactorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.number(5);
        System.out.println("예상 결과 : 120");
        System.out.println("실제 결과 : " + result);
    }
}