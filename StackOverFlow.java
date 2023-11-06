package java_basic;

public class StackOverFlow {

    public static void main(String[] args) {
        System.out.println("Stack 메모리 오류");
        try {
            int num = func(0);
        } catch (Error e) {
            System.out.println(e);
        }
    }

    private static int func(int num) {
        num = num + 1;
        return func(num);
    }
}