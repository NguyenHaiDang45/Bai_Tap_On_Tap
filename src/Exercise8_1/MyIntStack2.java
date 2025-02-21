package Exercise8_1;

public class MyIntStack2 {
    private int[] contents;
    private int tos;

    public MyIntStack2(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public boolean push(int element) {
        if (isFull()) {
            return false;
        }
        contents[++tos] = element;
        return true;
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
