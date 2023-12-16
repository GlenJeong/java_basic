package java_basic;

import java.util.Stack;

public class StackPrcatice {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String expression = "(3 + 2 / (1 * 4))";

        System.out.println("expression : " + expression);

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    stack.pop();
                }
            }

            // 괄호가 일치하거나 부족하면 if문을 실행한다.
            if (stack.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 불일치합니다.");
            }
            // 수식의 괄호가 일치하고도 괄호가 더 많으면 Exception 발생한다.
        } catch (Exception e) {
            System.out.println("Exception 괄호가 불일치합니다.");
        }
    }
}
