package java_basic;

public class ArrayStack {
    private int top;
    private int sizeMax;
    private int[] arrayStack;

    public ArrayStack(int sizeMax) {
        this.top = -1;
        this.sizeMax = sizeMax;
        this.arrayStack = new int[sizeMax];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == sizeMax - 1);
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("공간이 없습니다.");
            throw new IndexOutOfBoundsException("공간이 부족합니다.");
        }

        arrayStack[++top] = num;

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비었습니다.");
            return -1;
        }
        System.out.println(arrayStack[top] + "을 꺼냄");
        int pickUp = arrayStack[top--];
        return pickUp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("스택이 비었습니다.");
            return -1;
        }

        return arrayStack[top];
    }

    public void clear() {
        top = -1;
    }

    public int Size() {
        return top + 1;
    }

    public int length() {
        return sizeMax;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        System.out.println(arrayStack.Size());
        System.out.println(arrayStack.length());
        arrayStack.push(10);
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.Size());
        System.out.println(arrayStack.isEmpty());
        arrayStack.clear();
        System.out.println(arrayStack.Size());
        System.out.println(arrayStack.isEmpty());
        System.out.println();
        arrayStack.pop();
        System.out.println(arrayStack.isFull());
        for (int i = 0; i < arrayStack.length(); i++) {
            arrayStack.push(i);
            System.out.println(arrayStack.peek());
        }
        System.out.println(arrayStack.isFull());
        System.out.println();
        System.out.println(arrayStack.peek());
    }
}
