package java_basic;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();// push, pop, peek, empty, seach 지원
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            System.out.println(stack.peek());
        } // 1, 2, 3, 4, 5 출력
        System.out.println("Pop() : " + stack.pop()); // 5 제거 가장 최근에 들어간 값을 제거함
        System.out.println(stack.peek()); // 가장 최근에 들어간 값을 출력함
        System.out.println(stack.search(3)); // 인덱스 3을 출력한다.
        System.out.println("Pop() : " + stack.pop()); // 4 제거
        System.out.println("Pop() : " + stack.pop()); // 3제거
        System.out.println("Pop() : " + stack.pop()); // 2제거
        System.out.println("Pop() : " + stack.pop()); // 1제거
        System.out.println(stack.isEmpty()); // true 출력
    }

}