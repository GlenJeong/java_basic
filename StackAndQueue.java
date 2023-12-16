package java_basic;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push(0);
        stack.push(1);
        stack.push(2);

        while (!stack.empty()) {
            System.out.println("Stack: " + stack.pop());
        }

        System.out.println();

        queue.offer(0);
        queue.offer(1);
        queue.offer(2);

        while (!queue.isEmpty()) {
            System.out.println("Queue: " + queue.poll());
        }

    }
}
