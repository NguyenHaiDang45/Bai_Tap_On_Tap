package Exercise8_1;

public class MyIntStack1 {
    private int[] contents;
    private int tos;

    public MyIntStack1(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        contents[++tos] = element;
    }

    public int pop() {
        return contents[tos--];
    }

    public int peek() {
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }
}
